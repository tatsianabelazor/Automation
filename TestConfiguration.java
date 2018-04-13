package automation;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class TestConfiguration {
    private Calculator calc;
    @BeforeMethod
    public void setUp() throws Exception {
        calc = new Calculator();
        System.out.println("@BeforeMethod");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("@AfterMethod");
    }
}
