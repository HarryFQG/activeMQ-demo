package com.start.engineer.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author fengqigui
 * @Date 2017/12/6 19:29
 * JMS MessageListener接受方式为：异步方式，
 *            session.receive()同步方式（不用）
 *
 */

public class QueueReceiveOne implements MessageListener{


    @Override
    public void onMessage(Message message) {

        try {

            // 如果设置为客户端自动确认，就必须手动确认，否则默认消息消费失败的。
            //message.acknowledge();

            System.out.println("QueueReceive1--收到："+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }



}
