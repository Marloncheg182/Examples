package com.example.ws;

import com.example.bo.MyBoObject;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@WebService(serviceName = "MyWebService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class MyWebService {
    MyBoObject myBoObject;

    @WebMethod(exclude = true)
    public void setMyBoObject(MyBoObject myBoObject) {
        this.myBoObject = myBoObject;
    }

    @WebMethod(operationName = "printMessage")
    public String printMessage(){
        return myBoObject.printMessage();
    }
}
