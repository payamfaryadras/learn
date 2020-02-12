package com.payam.learn.jms;
import javax.jms.*;
public class SimpleMessageReceiver implements MessageListener {

    private Connection connection;


    public void startListener() throws JMSException {
        ConnectionFactory factory = JmsProvider.getConnectionFactory();
        this.connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("example.queue");
        MessageConsumer messageConsumer = session.createConsumer(queue);
        messageConsumer.setMessageListener(this);
    }

    @Override
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            TextMessage textMessage = (TextMessage) message;
            try {
                System.out.printf("Message received: %s, Thread: %s%n",
                        textMessage.getText(),
                        Thread.currentThread().getName());
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void destroy() throws JMSException {
        connection.close();
    }
}
