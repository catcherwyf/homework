package com.catcher.activemqdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;


@SpringBootTest
class ActivemqQueneTest {
    @Autowired
    public ActivemqQuene quene;

    @Test
    public void TopicTest() throws JMSException, InterruptedException {
        Connection connection = quene.getConnect();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        quene.consumer(session);
        quene.producer(session);
        Thread.sleep(2000);
        session.close();
        connection.close();
    }
}