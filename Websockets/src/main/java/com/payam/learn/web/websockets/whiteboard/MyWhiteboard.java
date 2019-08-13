package com.payam.learn.web.websockets.whiteboard;

import com.payam.learn.web.websockets.whiteboard.model.Figure;
import com.payam.learn.web.websockets.whiteboard.model.FigureDecoder;
import com.payam.learn.web.websockets.whiteboard.model.FigureEncoder;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint(value = "/wh", encoders = FigureEncoder.class, decoders = FigureDecoder.class)
public class MyWhiteboard {
    private static Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());


    @OnMessage
    public void onMessage(Figure figure, Session session) throws IOException, EncodeException {

        System.out.println("broadcastFigure: " + figure);
        for (Session peer : peers) {
            if (!peer.equals(session)) {
                peer.getBasicRemote().sendObject(figure);
            }
        }
    }

    @OnMessage
    public void broadcastSnapshot(ByteBuffer data, Session session) throws IOException {

        System.out.println("broadcastBinary: " + data);
        for (Session peer : peers) {
            if (!peer.equals(session)) {
                peer.getBasicRemote().sendBinary(data);
            }
        }
    }

    @OnOpen
    public void onOpen(Session peer) {
        peer.setMaxTextMessageBufferSize(1000000);
        peers.add(peer);
    }


    @OnClose
    public void onClose(Session peer) {
        peers.remove(peer);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {

    }
}
