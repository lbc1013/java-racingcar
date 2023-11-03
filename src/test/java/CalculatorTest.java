import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void nullOrEmptyStringTest() {
        int resultForNull = Calculator.cal(null);
        int resultForEmpty = Calculator.cal("");

        assertThat(resultForNull).isEqualTo(0);
        assertThat(resultForEmpty).isEqualTo(0);
    }

    @Test
    void singleNumber() {
        String input = "1";
        assertThat(Calculator.cal(input)).isEqualTo(1);

    }

    @Test
    void multipleNumberWithComma() {
        String input = "1,2,3";
        assertThat(Calculator.cal(input)).isEqualTo(6);
    }

    @Test
    void multipleNumberWithColon() {
        String input = "1:2:3";
        assertThat(Calculator.cal(input)).isEqualTo(6);
    }

    @Test
    void multipleNumberWithCommaAndColon() {
        String input = "1,2:3";
        assertThat(Calculator.cal(input)).isEqualTo(6);
    }
}