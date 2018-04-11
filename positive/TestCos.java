package automation.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestCos {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] cosData() {
        return new Object[][]{
                {4.7123889803846898576939650749193, 0},
                {6.283185307179586476925286766559, 1},
                {1.5707963267948966192313216916398, 0}};
    }

    @Test(dataProvider = "cosData")
    public void testCos(double a, double expectedResult) {
        double result = calc.cos(a);
        Assert.assertEquals(result, expectedResult, "Cosinus is incorrect, expected:" + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestCos is finished");
    }

}
