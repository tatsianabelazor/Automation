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
public class TestSqrt {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] sqrtData() {
        return new Object[][]{
                {4, 2},
                {9, 3},
                {100, 10},
                {196, 14},
        };
    }

    @Test(dataProvider = "sqrtData")
    public void testSqrt(double a, double expectedResult) {
        double result = calc.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Sqrt is incorrect, expected:" + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestSqrt is finished");
    }

}
