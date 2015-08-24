package RegularExp.ValidateTime24Hs;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class Time24HoursValidatorTest {

    private Time24HoursValidator time24HoursValidator;

    @BeforeClass
    public void initData(){
        time24HoursValidator = new Time24HoursValidator();
    }

    @DataProvider
    public Object[][] ValidTime24HoursProvider() {
        return new Object[][]{
                new Object[] {"01:00"}, new Object[] {"02:00"},
                new Object[] {"13:00"}, new Object[] {"1:00"},
                new Object[] {"2:00"},new Object[] {"13:01"},
                new Object[] {"23:59"}, new Object[] {"15:00"},
                new Object[] {"00:00"}, new Object[] {"0:00"}
        };
    }

    @DataProvider
    public Object[][] InvalidTime24HoursProvider() {
        return new Object[][]{
                new Object[] {"24:00"},new Object[] {"12:60"},
                new Object[] {"0:0"},new Object[] {"13:1"},
                new Object[] {"101:00"}
        };
    }

    @Test(dataProvider = "ValidTime24HoursProvider")
    public void ValidTime24HoursTest(String time) {
        boolean valid = time24HoursValidator.validate(time);
        System.out.println("Time24Hours is valid : " + time + " , " + valid);
        Assert.assertEquals(true, valid);
    }

    @Test(dataProvider = "InvalidTime24HoursProvider",
            dependsOnMethods="ValidTime24HoursTest")
    public void InValidTime24HoursTest(String time) {
        boolean valid = time24HoursValidator.validate(time);
        System.out.println("Time24Hours is valid : " + time + " , " + valid);
        Assert.assertEquals(false, valid);
    }
}