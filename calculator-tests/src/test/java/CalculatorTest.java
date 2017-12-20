
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author kurau (Yuri Kalinin)
 */
public class CalculatorTest {

    private CalculatorClient calculator = new CalculatorClient();

    @Test
    public void shouldAddTwoNumbers() {
        int result = calculator.adding(1, 2);
        assertTrue("Ожидали другой результат", result==4);
    }

}
