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
public class TestPow {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] powData() {
        return new Object[][]{
                {4, 2, 16},
                {9, 3, 729},
                {2, 10, 1024},
                {10, -10, 0.0000000001},
        };
    }

    @Test(dataProvider = "powData")
    public void testPow(double a, double b, double expectedResult) {
        double result = calc.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Pow is incorrect, expected:" + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestPow is finished");
    }
}
