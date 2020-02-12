package com.payam.learn.web.websockets.chat;

import com.payam.learn.web.websockets.chat.model.Message;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(value = "/chat/{username}", decoders = MessageDecoder.class, encoders = MessageEncoder.class)
public class ChatEndpoint {

    private static HashMap<String, String> users = new HashMap<>();
    private static Set<ChatEndpoint> chatEndpoints = new CopyOnWriteArraySet<>();
    private Session session;

    @OnOpen
    public void onOpen(Session session, @PathParam("username") String userName) {
        users.put(session.getId(), userName);
        chatEndpoints.add(this);
        this.session = session;
        Message message = new Message();
        message.setFrom(userName);
        message.setText("Connected!");
        brodcast(message);
    }

    @OnMessage
    public void onMessage(Session session, Message message)
            throws IOException {
        message.setFrom(users.get(session.getId()));
        brodcast(message);
    }

    @OnClose
    public void onClose(Session session) throws IOException {
        // WebSocket connection closes
        chatEndpoints.remove(this);
        Message message = new Message();
        message.setFrom(users.get(session.getId()));
        message.setText("Disconnected!");
        brodcast(message);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }

    private static void brodcast(Message message) {
        chatEndpoints.forEach(endpoint -> {
            synchronized (endpoint) {
                try {
                    endpoint.session.getBasicRemote().sendObject(message);

                } catch (Exception e) {
                }
            }
        });
    }
}
