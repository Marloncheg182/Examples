package Structural.Proxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

/**
 * Created by Dell on 6/20/2015.
 */
public class MatchMakingTestDrive {
    Hashtable datingDB = new Hashtable();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }
    public MatchMakingTestDrive(){                                    // constructor of candidates
        initializeDatabase();
    }
    public void drive(){
        PersonBean joe = getPersonFromDatabase("Joe Javabean");        // reading from DataBase
        PersonBean ownerProxy = getOwnerProxy(joe);                   // creating of Proxy for Owner
        System.out.println("Name is " + ownerProxy.getName());        // Get method calls
        ownerProxy.setInterests("bowling, Go");                       // Set method calls
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setHotOrNotRating(10);                         // trying to change the rating mark
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");  // fail
        }
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);             // creating a Proxy for another owner
        System.out.println("Name is " + nonOwnerProxy.getName());     // Get method calls
        try {
            nonOwnerProxy.setInterests("bowling, Go");                // Set method calls
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");   // fail
        }
        nonOwnerProxy.setHotOrNotRating(3);                           // trying to change the rating mark
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());    // Works!
    }

    PersonBean getNonOwnerProxy (PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));

    }


        PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }
    PersonBean getPersonFromDatabase(String name) {
        return (PersonBean)this.datingDB.get(name);
    }

    void initializeDatabase() {
        PersonBeanImpl joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        this.datingDB.put(joe.getName(), joe);
        PersonBeanImpl kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        this.datingDB.put(kelly.getName(), kelly);
    }
}


