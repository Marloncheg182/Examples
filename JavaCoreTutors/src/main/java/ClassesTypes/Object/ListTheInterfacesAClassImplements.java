package ClassesTypes.Object;

import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
public class ListTheInterfacesAClassImplements {
    public static void main(String[] args) {
        Class<?> clasz =TreeMap.class;
        Class<?>[] interfaces = clasz.getInterfaces();
        System.out.println("TreeMap implements interfaces: ");
        for (int i = 0; i < interfaces.length; i++){
            System.out.println("t" + interfaces[i]);
        }
    }
}
