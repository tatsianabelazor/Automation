package automation.positive;

import automation.TestConfiguration;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestSin extends TestConfiguration {
    Calculator calc = new Calculator();

    @DataProvider
    public Object[][] sinData() {
        return new Object[][]{
                {4.7123889803846898576939650749193, -1},
                {6.283185307179586476925286766559, 0},
                {1.5707963267948966192313216916398, 1}};
    }

    @Test(dataProvider = "sinData")
    public void testSin(double a, double expectedResult) {
        double result = calc.sin(a);
        Assert.assertEquals(result, expectedResult, "Sinus is incorrect, expected:" + expectedResult);
    }
}
