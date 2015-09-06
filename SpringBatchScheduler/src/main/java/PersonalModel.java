/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class PersonalModel {
    String firstName, lastName, school;
    int rollNumber;

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

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", school='" + school + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
