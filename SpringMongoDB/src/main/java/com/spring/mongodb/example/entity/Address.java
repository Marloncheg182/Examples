package com.spring.mongodb.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
@Document(collection = "address")
public class Address {

    @Id
    private long addressId;

    private String address;

    private String city;

    private String state;

    private long zipcode;

    public Address() {
        System.out.println("Calling default cons");
    }

    @PersistenceConstructor
    public Address(String address, long addressId, String city, String state, long zipcode) {
        this.address = address;
        this.addressId = addressId;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", addressId=" + addressId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
