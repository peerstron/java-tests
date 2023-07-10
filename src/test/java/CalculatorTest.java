import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addTest() {
        Calculator calculator = new Calculator();

        Assertions.assertEquals(6, calculator.add(3,3));
    }
}
