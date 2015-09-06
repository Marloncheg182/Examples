package com.example;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class Converter {
    private static final String FILE_NAME = "info.xml";
    private CustomerInfo info = new CustomerInfo();
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public void saveCustomerInfo() throws IOException{
        FileOutputStream outputStream = null;
        try {
            System.out.println("------Marshaller------");
            outputStream = new FileOutputStream(FILE_NAME);
            info.setName("Oleg");
            info.setId(1);
            info.setValid(true);
            this.marshaller.marshal(info, new StreamResult(outputStream));
            System.out.println("CustomerInfo " + info + "saved to xml");
        }finally {
            if (outputStream !=null){
                outputStream.close();
            }
        }
    }
    public void loadCustomerInfo() throws IOException{
        FileInputStream inputStream = null;
        try {
            System.out.println("------Unmarshaller------");
            inputStream = new FileInputStream(FILE_NAME);
            this.info = (CustomerInfo)this.unmarshaller.unmarshal(new StreamSource(inputStream));
            System.out.println("Info loaded from xml : " + info);
        }finally {
            if (inputStream !=null){
                inputStream.close();
            }
        }
    }
}
