package com.payam.learn.designpatterns.creational.prototype;

public abstract class Shape implements Cloneable {

    private int id;
    protected String type;

    abstract void draw();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception ex) {
            return clone;
        }
        return super.clone();
    }
}
