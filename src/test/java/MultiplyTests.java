import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplyTests {
    @Test
    @DisplayName("곱셈")
    public void testMultiplyTwoNumbers1() {
        Multiply multiply = new Multiply();
        int result = multiply.multiplyTwoNumbers(1, 2);

        Assertions.assertEquals(2, result);
    }
}
