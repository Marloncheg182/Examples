package core;

import config.BeanConfig;
import hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dell on 6/16/2015.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeenConfig.class);
        HelloWorld world = (HelloWorld)context.getBean("helloWorld");

        world.sayHelloWorld("Hello World!");
    }
}
