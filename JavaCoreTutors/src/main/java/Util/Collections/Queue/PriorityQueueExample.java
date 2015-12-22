package Util.Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(20, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = o1 % 2 - o2 % 2;
                if (result == 0) {
                    result = o1 - o2;
                }
                return result;
            }
        });
        for (int i = 0; i < 20; i++){
            pq.offer(20 - i);
        }
        for (int i = 0; i < 20; i++){
            System.out.println(pq.poll());
        }

    }
}
