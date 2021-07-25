package com.catcher.activemqdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;


@SpringBootTest
class activemqTopicTest {
    @Autowired
    public ActivemqTopic topic;

    @Test
    public void TopicTest() throws JMSException, InterruptedException {
        Connection connection = topic.getConnect();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        topic.consumer(session);
        topic.producer(session);
        Thread.sleep(2000);
        session.close();
        connection.close();
    }
}