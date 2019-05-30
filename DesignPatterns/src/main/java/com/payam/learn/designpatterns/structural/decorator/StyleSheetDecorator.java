package com.payam.learn.designpatterns.structural.decorator;

import java.util.Arrays;

public class StyleSheetDecorator extends Render {

    private Render render;

    public StyleSheetDecorator(Render render, Attribute... attributes) {
        super(attributes);
        this.render = render;
    }

    @Override
    public String write() {
        String styles = writeAttributesAsStyle(getAttributes());
        if (styles != null) {
            styles = "style=\'" + styles + "\'";
            return "<div class='form-input' " + styles + " >" +
                    render.write() + "</div>";
        }

        return null;
    }


    private String writeAttributesAsStyle(Attribute... attributes) {
        String result;
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + ":" + attr.getValue() + ";")
                    .reduce("", String::concat);
        } else {
            result = "";
        }
        return result;
    }
}
