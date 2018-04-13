package automation.positive.arithmetic;

import automation.TestConfiguration;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestSqrt extends TestConfiguration {
    Calculator calc = new Calculator();

    @DataProvider
    public Object[][] sqrtData() {
        return new Object[][]{
                {4, 2},
                {9, 3},
                {100, 10},
                {196, 14},
        };
    }

    @Test(dataProvider = "sqrtData", groups = "Arithmentic")
    public void testSqrt(double a, double expectedResult) {
        double result = calc.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Sqrt is incorrect, expected:" + expectedResult);
    }
}
