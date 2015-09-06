package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Aspect
public class DoAfterReturningAspect {

    @AfterReturning(pointcut = "execution(* com.example.SimpleService.sayHello(..))", returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("***AspectJ*** DoAfterReturning() is running!! intercepted : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
    }
}
