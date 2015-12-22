package Util.Collections.Sort;

import java.util.*;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class BackwardSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> randInts = new ArrayList<>();
        Random rnd = new Random();

        for (int i =0; i<5; i++){
            randInts.add(rnd.nextInt());
        }

        printList(randInts);

        Collections.sort(randInts, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2.intValue() > o1.intValue() ? 1 : -1);
            }
        });

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
