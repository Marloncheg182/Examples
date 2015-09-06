package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class Runner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SendMailExample mm = (SendMailExample)context.getBean("sendMailExample");
        mm.sendMail("sender@gmail.com", "receiver@gmail.com", "Testing message", "Testing...");
        mm.sendMailWithTemplate("dear", "content");
        mm.sendMailWithAttachment("dear", "content");
        context.close();
    }
}
