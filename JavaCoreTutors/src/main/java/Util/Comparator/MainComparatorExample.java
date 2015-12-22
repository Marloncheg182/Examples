package Util.Comparator;

import java.util.Arrays;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class MainComparatorExample {
    public static void main(String[] args) {
        Student student[] = new Student[3];

        student[0] = new Student();
        student[0].setName("Oleg");
        student[0].setGrade(25);

        student[1] = new Student();
        student[1].setName("Vitalik");
        student[1].setGrade(31);

        student[2] = new Student();
        student[2].setName("Marya");
        student[2].setGrade(30);

        System.out.println("Order of students before sorting is: ");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t"
                    + student[i].getGrade());
        }
        Arrays.sort(student, new GradeComparator());
        System.out.println("Order of students after sorting by student grade is");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t"
                    + student[i].getGrade());
        }
        Arrays.sort(student, new NameComparator());
        System.out
                .println("Order of students after sorting by student name is");

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t"
                    + student[i].getGrade());
        }
    }
}
