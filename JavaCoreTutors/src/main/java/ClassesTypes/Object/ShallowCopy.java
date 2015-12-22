package ClassesTypes.Object;

/**
 * Created by O1e6 <NsN> on 12/20/2015.
 */
public class ShallowCopy {
    public static void main(String[] args) {

        //Original Object

        Persons person = new Persons("Person-A", "Civic");

        System.out.println("Original : " + person.getN() + " - "


                + person.getC().getN());


        //Clone as a shallow copy

        Persons person2 = (Persons) person.clone();


        System.out.println("Clone (before change): " + person2.getN() + " - "


                + person2.getC().getN());


        //change the primitive member

        person2.setN("Person-B");


        //change the lower-level object

        person2.getC().setN("Accord");


        System.out.println("Clone (after change): " + person2.getN() + " - "


                + person2.getC().getN());


        System.out.println("Original (after clone is modified): " + person.getN()


                + " - " + person.getC().getN());

    }
}

class Persons implements Cloneable {
    //Lower-level object

    private Cars carObject;
    private String name;

    public Cars getC() {

        return carObject;
    }

    public String getN() {

        return name;
    }

    public void setN(String s) {

        name = s;
    }

    public Persons(String s, String t) {

        name = s;

        carObject = new Cars(t);
    }

    @Override
    public Object clone() {

        //shallow copy

        try {


            return super.clone();

        } catch (CloneNotSupportedException e) {


            return null;

        }
    }
}

class Cars {

    private String carName;

    public String getN() {

        return carName;
    }

    public void setN(String s) {

        carName = s;
    }

    public Cars(String s) {

        carName = s;
    }
}
