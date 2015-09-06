package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Converter converter = (Converter)context.getBean("converterBean");
        try {
            converter.saveCustomerInfo();
            converter.loadCustomerInfo();
        }catch (IOException e){
            e.printStackTrace();
        }
        context.close();
    }
}
