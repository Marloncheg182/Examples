package Behavioral.Iterator;

/**
 * Created by Dell on 6/21/2015.
 */
public class IteratorLoader {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
