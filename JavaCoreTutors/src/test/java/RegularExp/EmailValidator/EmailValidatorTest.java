package RegularExp.EmailValidator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class EmailValidatorTest {

    private EmailValidator emailValidator;

    @BeforeClass
    public void initData() {
        emailValidator = new EmailValidator();
    }

    @DataProvider
    public Object[][] ValidEmailProvider() {
        return new Object[][] { { new String[] {

                "marloncheg182@gmail.com",
                 } } };
    }

    @DataProvider
    public Object[][] InvalidEmailProvider() {
        return new Object[][] { { new String[] { "marloncheg", "mkyong@.com.my",
                "marloncheg182@gmail.a", "marloncheg-182@yahoo.com\", \"marloncheg.182@yahoo.com" } } };
    }

    @Test(dataProvider = "ValidEmailProvider")
    public void ValidEmailTest(String[] Email) {

        for (String temp : Email) {
            boolean valid = emailValidator.validate(temp);
            System.out.println("Email is valid : " + temp + " , " + valid);
            Assert.assertEquals(valid, true);
        }

    }

    @Test(dataProvider = "InvalidEmailProvider", dependsOnMethods = "ValidEmailTest")
    public void InValidEmailTest(String[] Email) {

        for (String temp : Email) {
            boolean valid = emailValidator.validate(temp);
            System.out.println("Email is valid : " + temp + " , " + valid);
            Assert.assertEquals(valid, false);
        }
    }
}