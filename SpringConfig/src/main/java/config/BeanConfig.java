package config;

import hello.HelloWorld;
import hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dell on 6/16/2015.
 */
@Configuration
public class BeanConfig {

    @Bean(name = "helloBean")
    public HelloWorldImpl helloWorld(){
        return new HelloWorldImpl();
    }
}
