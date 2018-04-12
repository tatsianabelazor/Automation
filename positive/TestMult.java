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
public class TestMult {

    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @DataProvider
    public Object[][] multData() {
        return new Object[][]{
                {2, 3, 6},
                {0, 0, 0},
                {-2, 2, -4},
                {5, 5, 25},
                {3000, 7000, 21000000}};
    }

    @Test(dataProvider = "multData")
    public void testMult(double a, double b, double expectedResult) {
        double result = calc.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Multiplication action is incorrect:" + expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestMult is finished");
    }
}

