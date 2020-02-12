package com.payam.learn.web.websockets.whiteboard.model;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.StringWriter;

public class Figure {
    private JsonObject jsonObject;

    public Figure(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public String toString() {
        StringWriter writer = new StringWriter();
        Json.createWriter(writer).write(jsonObject);
        return writer.toString();
    }
}
