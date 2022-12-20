import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Factorial group test")
public class FactorialAlgorithmGroupTest {

    @Nested
    class FactorialRecursionAlgorithmTest {

        @Test
        @DisplayName("Recursion algorithm test, should calculate 3! to 6")
        void recursionTest() {
            // Given
            int n = 3;

            // When
            int res = FactorialAlgorithms.Recursive.factorial(n);

            // Then
            Assertions.assertThat(res).isEqualTo(6);
        }
    }

    @Nested
    class FactorialIterationAlgorithmTest {

        @Test
        @DisplayName("Iterative algorithm test, should return for 3! 6")
        void iterationTest() {
            // Given
            int n = 3;

            // When
            int res = FactorialAlgorithms.Iterative.factorial(n);

            // Then
            Assertions.assertThat(res).isEqualTo(6);
        }
    }
}
