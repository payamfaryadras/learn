package com.payam.learn.designpatterns.creational.builder;

public class SomeThing {

    private int id;
    private String name;
    private int size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



   public static class Builder{
       private int id;
       private String name;
       private int size;

       public Builder(int id) {
           this.id = id;
       }

       public Builder id(int id) {
           this.id = id;
           return this;
       }

       public Builder name(String name) {
           this.name = name;
           return this;
       }

       public Builder setSize(int size) {
           this.size = size;
           return this;
       }

       public SomeThing build(){
           SomeThing someThing = new SomeThing();
           someThing.id = this.id;
           someThing.name = this.name;
           someThing.size = this.size;
           return someThing;
       }

   }



}
