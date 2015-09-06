package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class Runner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleService service = (SimpleService)context.getBean("simpleServiceBean");
        service.printNameId();
        System.out.println("---------------");
        try {
            service.checkName();
        }catch (Exception e){
            System.out.println("SimpleService checkName() : Exception thrown..");
        }
        System.out.println("---------------");
        service.sayHello("Hello");
        System.out.println("---------------");
        context.close();
    }
}
