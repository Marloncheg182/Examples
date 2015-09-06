package com.springbatch.example.util;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
public class User {
    StringBuilder firstName, middleName, lastName;
    StringBuilder city;
    int id;

    public StringBuilder getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StringBuilder getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringBuilder getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StringBuilder getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return firstName + " "
                + middleName + " "
                + lastName + "resides  in :" +
                city + '}';
    }
}
