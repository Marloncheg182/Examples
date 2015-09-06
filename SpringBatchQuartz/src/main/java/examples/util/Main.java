package examples.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 9/1/2015.
 */
public class Main {
    public static void main(String[] args) {
        String[]str = {"classpath:context.xml", "classpath:job-config.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(str);
    }
}
