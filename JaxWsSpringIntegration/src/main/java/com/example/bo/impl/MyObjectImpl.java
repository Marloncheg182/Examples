package com.example.bo.impl;

import com.example.bo.MyBoObject;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class MyObjectImpl implements MyBoObject {
    @Override
    public String printMessage() {
        return "Hello from JAXWS";
    }
}
