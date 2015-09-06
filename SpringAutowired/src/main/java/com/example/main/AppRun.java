package com.example.main;

import com.example.bean.UserAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class AppRun {
    private UserAccountService userAccountService;

    public AppRun() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        UserAccountService accountService = (UserAccountService) context.getBean("userAccountService");
        System.out.println(accountService.getName());
        System.out.println(accountService.getDescription());
        System.out.println(accountService.getDetails());
        context.close();
    }

    public static void main(String[] args) {
        new AppRun();
    }
    }

