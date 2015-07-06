package logic;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by Dell on 6/8/2015.
 */

@Entity
@Table(name="Test")
public class Test {
    private Long tid;
    private String tname;
    private Statistics statistics;
    private Student student;

    public Test() {
        tname = null;
    }

    public Test(String s) {
        this.tname = s;
    }
@Id
@GeneratedValue(generator = "increment")
@GenericGenerator(name = "increment", strategy =  "increment")
@Column(name = "tid")
    public Long getTid() {
        return tid;
    }

    public void setTid(Long i) {
        this.tid = i;
    }
@Column(name = "tname")
    public String getTname() {
        return tname;
    }

    public void setTname(String s) {
        this.tname = s;
    }
    @ManyToOne
    @JoinColumn(name = "tid")
    public Statistics getStatistics()
    {
        return statistics;
    }

}

