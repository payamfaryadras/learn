package com.payam.learn.web.websockets.whiteboard.model;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class FigureEncoder implements Encoder.Text<Figure> {
    @Override
    public String encode(Figure figure) throws EncodeException {
        return figure.getJsonObject().toString();
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
