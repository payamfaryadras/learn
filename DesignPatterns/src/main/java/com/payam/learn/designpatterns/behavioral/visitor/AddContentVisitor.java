package com.payam.learn.designpatterns.behavioral.visitor;

public class AddContentVisitor implements ContentVisitor {
    @Override
    public void visit(Content content) {
        content.setDate(content.getDate()+10);
    }
}
