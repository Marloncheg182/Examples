package OOP;

/**
 * Created by Oleg Romanenchuk on 8/3/2015.
 */
public abstract class Classic {

    private String field1 = "firstField";
    private String field2 = "secondField";


    public abstract boolean doFirstAction(String field1);
    public abstract boolean doSecondAction(String field2, String field1);

}
