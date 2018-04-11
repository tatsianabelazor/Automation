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
public class TestCtg {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] ctgData() {
        return new Object[][]{
                {40, 1},
                {45, 1},
                {50, 1},
                {60, 1}};
    }
    @Test(dataProvider = "ctgData")
    public void testCtg(double a, double expectedResult) {
        double result = calc.ctg(a);
        Assert.assertEquals(result, expectedResult);
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("TestCtg is finished");
    }

}
