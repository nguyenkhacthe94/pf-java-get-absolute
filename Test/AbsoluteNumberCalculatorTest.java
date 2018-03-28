import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test case 0")
    void getAbsolute0() {
        int number = 0;
        int expected = 0;
        double result = AbsoluteNumberCalculator.getAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test case 1")
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        double result = AbsoluteNumberCalculator.getAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case -1")
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        double result = AbsoluteNumberCalculator.getAbsolute(number);
        assertEquals(expected, result);
    }
}