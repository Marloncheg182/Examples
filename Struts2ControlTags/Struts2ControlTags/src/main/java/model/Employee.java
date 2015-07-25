package model;

import java.util.List;
import java.util.Map;

/**
 * @author Oleg Romanenchuk
 */
public class Employee {
    private int id;
    private String role;

    private List<String> citiesList;
    private List<String> countryList;
    private Map<String, String> propertiesMap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getCitiesList(List<String> cities) {
        return citiesList;
    }

    public void setCitiesList(List<String> citiesList) {
        this.citiesList = citiesList;
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }

    public Map<String, String> getPropertiesMap() {
        return propertiesMap;
    }

    public void setPropertiesMap(Map<String, String> propertiesMap) {
        this.propertiesMap = propertiesMap;
    }
}
