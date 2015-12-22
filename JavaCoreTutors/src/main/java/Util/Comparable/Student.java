package Util.Comparable;

import java.util.Comparator;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int currentYearOfStudy;

    public Student(int id, String name, int currYearOfStudy) {
        this.id = id;
        this.name = name;
        this.currentYearOfStudy = currYearOfStudy;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentYearOfStudy() {
        return this.currentYearOfStudy;
    }

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name
                + ", Current Year of Study=" + this.currentYearOfStudy + "]";
    }

    @Override
    public int compareTo(Student stud) {
        return (this.id - stud.id);
    }

    public static Comparator<Student> idComperator = new Comparator<Student>() {

        @Override
        public int compare(Student st1, Student st2) {
            return (int) (st1.getId() - st2.getId());
        }
    };

    public static Comparator<Student> currentYearComperator = new Comparator<Student>() {

        @Override
        public int compare(Student st1, Student st2) {
            return (int) (st1.getCurrentYearOfStudy() - st2.getCurrentYearOfStudy());
        }
    };

}