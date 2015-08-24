package RegularExp.ValidateTime12HS;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class Time12HoursValidatorTest {

    private Time12HoursValidator time12HoursValidator;

    @BeforeClass
    public void initData(){
        time12HoursValidator = new Time12HoursValidator();
    }

    @DataProvider
    public Object[][] ValidTime12HoursProvider() {
        return new Object[][]{
                new Object[] {"1:00am"}, new Object[] {"1:00 am"},
                new Object[] {"1:00 AM"}, new Object[] {"1:00pm"},
                new Object[] {"1:00 pm"},new Object[] {"1:00 PM"},
                new Object[] {"12:50 pm"}
        };
    }

    @DataProvider
    public Object[][] InvalidTime12HoursProvider() {
        return new Object[][]{
                new Object[] {"0:00 am"},new Object[] {"10:00  am"},
                new Object[] {"1:00"},new Object[] {"23:00 am"},
                new Object[] {"1:61 pm"},new Object[] {"13:00 pm"},
                new Object[] {"001:50 pm"},new Object[] {"10:99 am"},
                new Object[] {"01:00 pm"}, new Object[] {"1:00 bm"}
        };
    }

    @Test(dataProvider = "ValidTime12HoursProvider")
    public void ValidTime12HoursTest(String time) {
        boolean valid = time12HoursValidator.validate(time);
        System.out.println("Time12Hours is valid : " + time + " , " + valid);
        Assert.assertEquals(true, valid);
    }

    @Test(dataProvider = "InvalidTime12HoursProvider",
            dependsOnMethods="ValidTime12HoursTest")
    public void InValidTime12HoursTest(String time) {
        boolean valid = time12HoursValidator.validate(time);
        System.out.println("Time12Hours is valid : " + time + " , " + valid);
        Assert.assertEquals(false, valid);
    }
}