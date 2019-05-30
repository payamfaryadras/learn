package com.payam.learn.designpatterns.structural.decorator;

public class SubmitInputElement extends Render {
    public SubmitInputElement(Attribute... attribute) {
        super(attribute);
    }

    @Override
    public String write() {

        return "<input type='submit'" +
                writeAttributes() +
                " />'";
    }
}
