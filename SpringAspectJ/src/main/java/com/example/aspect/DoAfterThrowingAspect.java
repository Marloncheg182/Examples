package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Aspect
public class DoAfterThrowingAspect {

    @AfterThrowing(pointcut = "execution(* com.example.SimpleService.sayHello(..))", throwing = "error")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable error){
        System.out.println("***AspectJ*** DoAfterThrowing() is running!! intercepted : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");

    }
}
