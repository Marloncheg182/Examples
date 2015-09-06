package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Aspect
public class DoBeforeAspect {

    @Before("execution(* com.example.SimpleService.sayHello(..))")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("***ApectJ*** DoBefore() is running!! intercepted : " +
        joinPoint.getSignature().getName());
    }

}
