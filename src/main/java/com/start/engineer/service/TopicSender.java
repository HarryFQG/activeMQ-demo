package com.start.engineer.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;


@Service
public class TopicSender {



    @Resource(name = "topicOneTemplate")
    private JmsTemplate template;

    public void send(String queueName, String message){
        template.send(queueName, new MessageCreator() {

            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });

    }



}

