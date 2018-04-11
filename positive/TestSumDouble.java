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
public class TestSumDouble {

    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] sumData() {
        return new Object[][]{
                {2.5, 3, 5.5},
                {0, 0, 0},
                {-2.3, 2, -0.3},
                {-30, -70, -100},
                {3000, 7000, 10000}};
    }

    @Test(dataProvider = "sumData")
    public void testSum(double a, double b, double expectedResult) {
        double result = calc.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of summary, expected:" + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestSumDouble is finished");
    }

}
