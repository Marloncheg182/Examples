package Structural.Proxy;

import Structural.Proxy.InvocationHandler;   // Handler Interface
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Dell on 6/20/2015.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;     // give a real object and save a link on him
    }

    // each call of method proxy will call the method invoke()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args); // if tge method "get" has been called, the call is handed to real object
            } else if (method.getName().equals("setHotOrNotRating")) { // this method blocks by IllegalAccessException
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);  // method was accessed, we can transfer it to another object.
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;    // in this case we return the NULL valut, to avoid the risk
    }

    // method gets a real object and return
    // the proxy for him, he own the same interface, as real object
    PersonBean getOwnProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
