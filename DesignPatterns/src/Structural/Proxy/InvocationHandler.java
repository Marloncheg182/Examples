package Structural.Proxy;

import java.lang.reflect.Method;

/**
 *
 */
public interface InvocationHandler extends java.lang.reflect.InvocationHandler{
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
