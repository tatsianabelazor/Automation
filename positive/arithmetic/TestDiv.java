package automation.positive.arithmetic;

import automation.TestConfiguration;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestDiv extends TestConfiguration {
    Calculator calc = new Calculator();

    @Test(groups = "Arithmentic")
    public void testDiv() {
        Assert.assertEquals(calc.div(10, 2), 5, "Division action is incorrect");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Arithmentic")
    public void testDivByZero() {
        Assert.assertEquals(calc.div(10, 0), "Attempt to divide by zero");
    }

}


