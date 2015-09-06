package examples.util;

/**
 * Created by Oleg Romanenchuk on 9/1/2015.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String school;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Hello!" +
               firstName + lastName + "welcome to "+ school + ".";
    }
}
