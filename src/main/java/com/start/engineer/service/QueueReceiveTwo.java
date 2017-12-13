package com.start.engineer.service;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


@Component("queueReceiveTwo")
public class QueueReceiveTwo implements MessageListener{


    @Override
    public void onMessage(Message message) {

        try {
            System.out.println("QueueReceive2--收到："+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }



}

