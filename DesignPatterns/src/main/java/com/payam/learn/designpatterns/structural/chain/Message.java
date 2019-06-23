package com.payam.learn.designpatterns.structural.chain;

public class Message {
    private DestinationType destinationType;
    private String value;

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {

        private DestinationType destinationType;
        private String value;

        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Message build() {
            Message message = new Message();
            message.setDestinationType(this.destinationType);
            message.setValue(this.value);
            return message;
        }
    }

}
