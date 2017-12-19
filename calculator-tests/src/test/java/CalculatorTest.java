
import org.junit.Test;

/**
 * @author kurau (Yuri Kalinin)
 */
public class CalculatorTest {

    private CalculatorClient calculator = new CalculatorClient();

    @Test
    public void shouldAddTwoNumbers() {
        int result = calculator.adding(1, 2);
    }

}
