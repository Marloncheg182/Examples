package com.example;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class CustomerInfo {
    private String name;
    private long id;
    private boolean valid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", valid=" + valid +
                '}';
    }
}
