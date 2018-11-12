import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }



    @Test
    public void canAdd(){
    assertEquals(10, calculator.add(2,8));
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(12,2));
    }
    @Test
    public void canMultiply(){
        assertEquals(24, calculator.multiply(12,2));
    }
    @Test
    public void canDivide(){
        assertEquals(12, calculator.divide(24,2));
    }
}
