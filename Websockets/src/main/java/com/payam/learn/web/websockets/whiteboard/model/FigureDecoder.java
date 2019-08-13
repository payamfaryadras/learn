package com.payam.learn.web.websockets.whiteboard.model;


import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.StringReader;
import java.io.StringWriter;

public class FigureDecoder implements Decoder.Text<Figure> {
    @Override
    public Figure decode(String s) throws DecodeException {
        JsonObject jsonObject = Json.createReader(new StringReader(s)).readObject();
        return new Figure(jsonObject);
    }

    @Override
    public boolean willDecode(String s) {
        try {
            Json.createReader(new StringReader(s)).readObject();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
