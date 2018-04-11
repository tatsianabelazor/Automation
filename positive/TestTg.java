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
public class TestTg {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] tgData() {
        return new Object[][]{
                {0.78539816339744830961566084581988, 1},
                {3.1415926535897932384626433832795, 0},
                {6.283185307179586476925286766559, 0}};
    }

    @Test(dataProvider = "tgData")
    public void testTg(double a, double expectedResult) {
        double result = calc.tg(a);
        Assert.assertEquals(result, expectedResult, "Cosinus is incorrect, expected:" + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestTg is finished");
    }
}
