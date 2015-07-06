package J2EE.CompositeEntity;

/**
 * Created by Dell on 6/21/2015.
 */
public class CoarseGrainedObject {
    DependantObject1 do1 = new DependantObject1();
    DependantObject2 do2 = new DependantObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }
    public String [] getData(){
        return new String [] {do1.getData(), do2.getData()};
    }
}
