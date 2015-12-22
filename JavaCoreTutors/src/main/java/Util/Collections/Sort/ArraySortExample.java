package Util.Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class ArraySortExample {
    public static void main(String[] args) {
        ArrayList<Integer> randInts = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++){
            randInts.add(rnd.nextInt());
        }

        printList(randInts);

        Collections.sort(randInts);

        printList(randInts);
    }

    private static void printList(List<Integer> list) {
        System.out.println(" [ ");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)+ " ");
        }
        System.out.println("]");
    }


}
