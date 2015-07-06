package logic;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by Dell on 6/8/2015.
 */
@Entity   //An Entity of our example table in database
@Table(name = "Student")       //Generate our table in database
public class Student {
    private Long id;
    private String name;
    private Long age;
    private Statistics statistics;
    private Test test;

    public Student() {
        name = null;
    }

    public Student(String s) {
        name = s;
    }

    @Id      //Choosing the Id descriptor annotation
    @GeneratedValue(generator = "increment")        //Generated value will be incremented
    @GenericGenerator(name = "increment", strategy = "increment")     //Value strategy
    @Column(name = "name")


    public Long getId() {
        return id;
    }

    public void setId(Long i) {
        id = i;
    }

    @Column(name = "name")  // Column "name"
    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    @Column(name = "age")
    public Long getAge() {
        return age;
    }

    public void setAge(Long l) {
        age = l;
    }

    @ManyToOne
    @JoinColumn(name = "id")
    public Statistics getStatistics() {
        return statistics;
    }
    @ManyToOne
    @JoinTable(name = "Statistics", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "tid"))
    public Test getTest(){
        return test;
    }


}


