package automation.positive.trigonometric;

import automation.TestConfiguration;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestCos extends TestConfiguration {
    Calculator calc = new Calculator();

    @DataProvider
    public Object[][] cosData() {
        return new Object[][]{
                {4.7123889803846898576939650749193, 0},
                {6.283185307179586476925286766559, 1},
                {1.5707963267948966192313216916398, 0}};
    }

    /**
     * There is a defect in the following method: public double cos(double a) {return Math.sin(a);}
     * Test failed
     */
    @Test(dataProvider = "cosData", groups = "Trigonometric")
    public void testCos(double a, double expectedResult) {
        double result = calc.cos(a);
        Assert.assertEquals(result, expectedResult, "Cosinus is incorrect, expected:" + expectedResult);
    }
}
