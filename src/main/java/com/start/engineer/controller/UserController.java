package com.start.engineer.controller;


import com.start.engineer.service.QueueSender;
import com.start.engineer.service.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fengqigui
 * @Date 2017/12/7 9:21
 */
@Controller
public class UserController {

    @Autowired
    private TopicSender topicSender;

    @Autowired
    private QueueSender queueSender;

    @RequestMapping("/testActiveMQ")
    public @ResponseBody String  getUser(){


        queueSender.send("com.it.queue","11花山大道北");
        topicSender.send("com.it.topic","11易酒批");
        return "success";




    }


}
