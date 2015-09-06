package com.spring.cassandra.example.entity;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Created by Oleg Romanenchuk on 8/29/2015.
 */
@Table("Person")
public class Person {

    @PrimaryKey
    private Integer pId;

    private String name;

    private Integer getpId(){
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pId=" + pId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!pId.equals(person.pId)) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = pId.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
