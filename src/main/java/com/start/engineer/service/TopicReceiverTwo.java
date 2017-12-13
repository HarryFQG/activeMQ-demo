package com.start.engineer.service;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;



/**
 * @author fengqigui
 * @Date 2017/12/6 19:44
 */



@Component("topicReceiverTwo")
public class TopicReceiverTwo implements MessageListener{


    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceive2--收到："+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

