package logic;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dell on 6/8/2015.
 */
public class Statistics {
    private Long stid;
    private Long id;
    private Long tid;
    private Set<Student> students = new HashSet<Student>(0);
    private Set<Test> tests = new HashSet<Test>(0);

    public Statistics() {
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "stid")
    public Long getStid() {
        return stid;
    }

    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Column(name = "tid")
    public Long getTid() {
        return tid;
    }
    @OneToMany
    @JoinColumn(name = "id")
  public Set<Student> getStudents(){
      return students;
  }
    @OneToMany
    @JoinColumn(name = "tid")
    public Set<Test> getTests(){
        return tests;
    }
}
