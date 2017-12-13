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

@Component("topicReceiverOne")
public class TopicReceiverOne implements MessageListener{


    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceive1--收到："+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
