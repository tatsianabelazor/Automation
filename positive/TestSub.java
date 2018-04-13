package automation.positive;

import automation.TestConfiguration;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */


public class TestSub extends TestConfiguration {
    Calculator calc = new Calculator();

    @Test
    public void testSub() {
        Assert.assertEquals(calc.sub(10, 5), 5, "Substarction action is incorrect");
    }
}


