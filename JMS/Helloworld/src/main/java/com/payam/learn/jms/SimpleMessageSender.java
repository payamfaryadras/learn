package com.payam.learn.jms;

import javax.jms.*;

public class SimpleMessageSender {
    private final MessageProducer messageProducer;
    private final Session session;
    private final Connection connection;

    public SimpleMessageSender() throws JMSException {
        ConnectionFactory factory = JmsProvider.getConnectionFactory();
        this.connection = factory.createConnection();
        connection.start();
        this.session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue =  session.createQueue("example.queue");
        this.messageProducer = session.createProducer(queue);
    }

    public void sendMessage(String message) throws JMSException {
        System.out.printf("Sending message: %s, Thread:%s%n",
                message,
                Thread.currentThread().getName());
        TextMessage textMessage = session.createTextMessage(message);
        messageProducer.send(textMessage);
    }
    public void destroy() throws JMSException {
        connection.close();
    }
}
