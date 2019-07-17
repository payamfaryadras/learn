package com.payam.learn.designpatterns.behavioral.visitor;

public class Content {

    private Integer date;

    public Content(Integer date) {
        this.date = date;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }
    public void accept(ContentVisitor contentVisitor){
        contentVisitor.visit(this);
    }
}
