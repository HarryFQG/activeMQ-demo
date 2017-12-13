package com.start.engineer.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * @author fengqigui
 * @Date 2017/12/6 19:35*/
@Service
public class QueueSender {


    @Resource(name = "queueOneTemplate")
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
