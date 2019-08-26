package com.payam.learn.web.websockets.chat;

import com.google.gson.Gson;
import com.payam.learn.web.websockets.chat.model.Message;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MessageDecoder implements Decoder.Text<Message> {
    private static Gson gson = new Gson();
    @Override
    public Message decode(String s) throws DecodeException {
        return gson.fromJson(s,Message.class);
    }

    @Override
    public boolean willDecode(String s) {
        return (s!=null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}