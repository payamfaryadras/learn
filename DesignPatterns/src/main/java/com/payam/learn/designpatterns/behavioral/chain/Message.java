package com.payam.learn.designpatterns.behavioral.chain;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private Map<DestinationType,String> dist;
    private String value;

    public Message(Map<DestinationType, String> dist, String value) {
        this.dist = dist;
        this.value = value;
    }

    public Map<DestinationType, String> getDist() {
        return dist;
    }

    public void setDist(Map<DestinationType, String> dist) {
        this.dist = dist;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static MessageBuilder getBuilder(){
        return new MessageBuilder();
    }

    public static class MessageBuilder {
        private Map<DestinationType, String> dist;
        private String value;

        public MessageBuilder() {
            this.dist = new HashMap<>();
        }

        public MessageBuilder addDist(DestinationType destinationType, String value) {
            this.dist.put(destinationType,value);
            return this;
        }

        public MessageBuilder value(String value) {
            this.value = value;
            return this;
        }

        public Message createMessage() {
            return new Message(dist, value);
        }
    }
}
