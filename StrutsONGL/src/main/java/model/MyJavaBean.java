package model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 7/26/2015.
 */
public class MyJavaBean {

    private String name;
    private boolean flag;
    private Integer age;
    private Date date;
    private String[] stocks;
    private String[] roles = new String[5];

    private List<Data> usersList;
    private List<Data> fruitsList;
    private Map<String, Data> userMap;

    private Rectangle rectangle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getStocks() {
        return stocks;
    }

    public void setStocks(String[] stocks) {
        this.stocks = stocks;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public List<Data> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Data> usersList) {
        this.usersList = usersList;
    }

    public List<Data> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(List<Data> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Map<String, Data> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, Data> userMap) {
        this.userMap = userMap;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
