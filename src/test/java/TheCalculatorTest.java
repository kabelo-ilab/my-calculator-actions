import org.testng.annotations.*;

import static org.testng.Assert.*;

public class TheCalculatorTest extends TheCalculator {

    TheCalculator calculator;
    @BeforeClass
    public void setUp() {
        calculator = new TheCalculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testTestCalcSum() {
        double actualSum = calcSum(5,6);
        assertEquals(actualSum,12);
    }

    @Test
    public void testTestSubtract() {
    }

    @Test
    public void testTestMultiply() {
    }

    @Test
    public void testTestDivide() {
    }
}