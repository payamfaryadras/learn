package com.payam.learn.jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.ConnectionFactory;

public class JmsProvider {
    public static ConnectionFactory getConnectionFactory(){
        ConnectionFactory factory = new ActiveMQConnectionFactory("vm://localhost");
        return factory;
    }
}
