package automation.positive;

import automation.TestConfiguration;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestCtg extends TestConfiguration {
   Calculator calc = new Calculator();

    @DataProvider
    public Object[][] ctgData() {
        return new Object[][]{
                {45, 1},
                {60, 1}};
    }
    @Test(dataProvider = "ctgData")
    public void testCtg(double a, double expectedResult) {
        double result = calc.ctg(a);
        Assert.assertEquals(result, expectedResult);
    }
}
