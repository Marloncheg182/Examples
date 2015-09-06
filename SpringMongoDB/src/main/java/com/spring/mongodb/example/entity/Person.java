package com.spring.mongodb.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
@Document(collection = "person")
public class Person{
    @Id
    private Long personId;

    private String name;

    private int age;

    @DBRef(db = "address")
    private List<Address> addres = new ArrayList<Address>();

    public Person(){}

    @PersistenceConstructor
    public Person(Long personId, String name, int age){
        super();
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public List<Address> getAddres() {
        return addres;
    }

    public void setAddres(List<Address> addres) {
        this.addres = addres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "addres=" + addres +
                ", personId=" + personId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
