package RegularExp.PasswordValidation;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @BeforeClass
    public void initData() {
        passwordValidator = new PasswordValidator();
    }

    @DataProvider
    public Object[][] ValidPasswordProvider() {
        return new Object[][]{
                {new String[]{
                        "oleg1", "oleggg2",
                }}
    };

 }

    @DataProvider
    public Object[][]InvalidPasswordProvider(){
        return new Object[][]{
                {new String[]{
                        "olegasd", "olegsdawd", "oleg1212"
                }}
        };
    }

    @Test(dataProvider = "ValidPasswordProvider")
    public void ValidPasswordTest(String[]password){
        for (String temp : password) {
            boolean valid = passwordValidator.validate(temp);
            System.out.println("Password is valid : " + temp + ", " + valid);
            Assert.assertEquals(true, valid);
        }
    }

    @Test(dataProvider = "InvalidPasswordProvider", dependsOnMethods = "ValidPasswordTest")
    public void InValidPasswordTest(String[]password){
        for (String temp : password) {
            boolean valid = passwordValidator.validate(temp);
            System.out.println("Password is valid : " + temp + " , " + valid);
            Assert.assertEquals(false,valid);
        }
    }
}

