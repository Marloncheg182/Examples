package com.example.bean;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class UserAccountService {
    private String name;
    private String description;
    private String details;

    public UserAccountService() {
        this.description = "New Service";
        this.details = "Account activated";
        this.name = "*****";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
