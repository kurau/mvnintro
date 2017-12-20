import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author kurau (Yuri Kalinin)
 */
public class MultiplyTest {

    private CalculatorClient calculator = new CalculatorClient();

    @Test
    public void shouldAddTwoNumbers() {
        int result = calculator.multiply(1, 2);
        assertThat("Ожидали другой результат", result, equalTo(2));
    }

}
