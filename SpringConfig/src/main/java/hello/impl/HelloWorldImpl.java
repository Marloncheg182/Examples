package hello.impl;

import hello.HelloWorld;

/**
 * Created by Dell on 6/16/2015.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld(String st) {
        System.out.println(st);
    }
}
