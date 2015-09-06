package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Aspect
public class DoAfterAspect {

    @After("execution(* com.example.SimpleService.sayHello(..))")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("***AspectJ*** DoAfter() is running!! intercepted : " + joinPoint.getSignature().getName());
    }
}
