package java.hibernateSpringExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by Dell on 6/9/2015.
 */
@Entity
public class Student {
    private Long id;
    private String name;
    private Long age;

    public Student() {
        name = null;
    }

    public Student(String n, long a) {
        this.name = n;
        this.age = a;
    }
    public Student(Student s)
    {
        name = s.getName();
    }
@Id
@GeneratedValue(generator = "increment")
@GenericGenerator(name = "increment", strategy = "increment")
@Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long i) {
        this.id = i;
    }
@Column
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
@Column
    public Long getAge() {
        return age;
    }

    public void setAge(Long l) {
        this.age = l;
    }
}
