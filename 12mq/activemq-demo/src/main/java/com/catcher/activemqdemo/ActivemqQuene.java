package com.catcher.activemqdemo;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.stereotype.Service;

import javax.jms.*;
@Service
public class ActivemqQuene {

     Destination destination = new ActiveMQQueue("test.queue");

    //获取连接
    public Connection getConnect() throws JMSException {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");

        ActiveMQConnection connection = (ActiveMQConnection) factory.createConnection();
        connection.start();
        return connection;
    }


    //消费者
    public void consumer(Session session) throws JMSException {
        MessageConsumer consumer = session.createConsumer(destination);
        MessageListener listener = new MessageListener() {
            @Override
            public void onMessage(Message message) {
                System.out.println(destination.toString()+":"+ message);
            }
        };
        consumer.setMessageListener(listener);
    }
    //生产者
    public void producer(Session session) throws JMSException {
        MessageProducer producer = session.createProducer(destination);
        int count = 0;
        while (count++ < 100){
            TextMessage message = session.createTextMessage(count + " message");
            producer.send(message);
        }
    }
}
