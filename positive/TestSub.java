package automation.positive;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */



public class TestSub {
    private Calculator calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }

    @Test
    public void testSub() {
        Assert.assertEquals(calc.sub(10, 5), 5, "Substarction action is incorrect");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TestSub is finished");
    }

}


