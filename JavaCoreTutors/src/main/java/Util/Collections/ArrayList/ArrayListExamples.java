package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add(2, "Item3");
        list.add("Item4");

        System.out.println("The ArrayList contains the following elements : " + list);

        int pos = list.indexOf("Item2");
        System.out.println("The index of Item2 is : " + pos);

        boolean check = list.isEmpty();
        System.out.println("Checking if the ArrayList is empty : " + check);

        int size = list.size();
        System.out.println("The size of ArrayList is : " + size);

        boolean element = list.contains("Item5");
        System.out.println("Checking if ArrayList contains the element : " + element);

        String item = list.get(0);
        System.out.println("The item with index 0 is : " + item);

        System.out.println("Retrieving items with loop using index and size list");
        for (int i = 0; i < list.size(); i++){
            System.out.println("Index: " + i + " - Item: " + list.get(i));
        }

        System.out.println("Retrieving items using foreach loop");
        for (String str : list) {
            System.out.println("Item is: " + str);
        }

        System.out.println("Retrieving, using iterator");
        for (Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println("Item is : " + it);
        }
        list.set(1, "NewItem");
        System.out.println("The ArrayList after the replacement is: " + list);

        list.remove(0);

        list.remove("Item3");

        System.out.println("The final contents of the ArrayList are: " + list);
        String[]simpleArray = list.toArray(new String[list.size()]);
        System.out.println("The array created after the conversion of our arraylist is: "
                + Arrays.toString(simpleArray));
    }
}
