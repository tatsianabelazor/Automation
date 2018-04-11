package automation.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestDiv {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }
    @Test()
    public void testDiv() {
        Assert.assertEquals(calc.div(10, 2), 5, "Division action is incorrect");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        Assert.assertEquals(calc.div(10, 0), "Attempt to divide by zero");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Blabla");
    }
}


