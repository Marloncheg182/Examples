package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Aspect
public class DoAroundAspect {

    @Around("execution(* com.example.SimpleService.sayHello(..))")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("***AspectJ*** DoAround() is running!! intercepted : " + joinPoint.getSignature().getName()
                + " \narguments : " + Arrays.toString(joinPoint.getArgs()));

        System.out.println("***AspectJ*** DoAround() before is running!");
        joinPoint.proceed(); // continue on the intercepted method
        System.out.println("***AspectJ*** DoAround() after is running!");
    }
}
