package RegularExp.HexColorCodeValidation;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class HexValidatorTest {
    private HexValidator hexValidator;

    @BeforeClass
    public void initData(){
        hexValidator = new HexValidator();
    }

    @DataProvider
    public Object[][] ValidHexProvider() {
        return new Object[][]{
                {new String[] {
                        "#1f1f1F", "#AFAFAF","#1AFFa1","#222fff", "#F00"
                }}
        };
    }

    @DataProvider
    public Object[][] InvalidHexProvider() {
        return new Object[][]{
                {new String[] {
                        "123456","#afafah","#123abce","aFaE3f",
                        "F00","#afaf", "#F0h"
                }}
        };
    }

    @Test(dataProvider = "ValidHexProvider")
    public void ValidHexTest(String[] hex) {

        for(String temp : hex){
            boolean valid = hexValidator.validate(temp);
            System.out.println("Hex is valid : " + temp + " , " + valid);
            Assert.assertEquals(true, valid);
        }

    }

    @Test(dataProvider = "InvalidHexProvider", dependsOnMethods="ValidHexTest")
    public void InValidHexTest(String[] hex) {

        for(String temp : hex){
            boolean valid = hexValidator.validate(temp);
            System.out.println("Hex is valid : " + temp + " , " + valid);
            Assert.assertEquals(false, valid);
        }

    }
}