package Util.Comparable;

import java.util.Arrays;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class ObjectSorting {
    public static void main(String[] args) {

        Student[] studentArray = new Student[3];
        studentArray[0] = new Student(1, "Nikos",1);
        studentArray[1] = new Student(5, "Ilias", 4);
        studentArray[2] = new Student(4, "Byron", 5);

        Arrays.sort(studentArray, Student.idComperator);
        System.out.println("Using id as key :"+ Arrays.toString(studentArray));

        Arrays.sort(studentArray, Student.currentYearComperator);
        System.out.println("Using Current Year of Study as key :"+ Arrays.toString(studentArray));

    }
}
