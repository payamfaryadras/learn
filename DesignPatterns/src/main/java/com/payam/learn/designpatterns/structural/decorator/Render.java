package com.payam.learn.designpatterns.structural.decorator;

import java.util.Arrays;
import java.util.jar.Attributes;

public abstract class Render {

    private Attribute[] attributes;

    public Render(Attribute... attributes) {
        this.attributes = attributes;
    }

    public Render() {

    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public void applyAttributes() {

    }

    public abstract String write();


    protected String writeAttributes() {
        String result = "";

        if (attributes != null) {
            result = Arrays.stream(attributes).
                    filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + "='" + attr.getValue() + "' ")
                    .reduce(" ",String::concat);
        }
        return result;
    }

}
