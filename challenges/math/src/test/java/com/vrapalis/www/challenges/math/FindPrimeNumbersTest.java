package com.vrapalis.www.challenges.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("Find primer number test")
public class FindPrimeNumbersTest {

    @Test
    @DisplayName("In range of 2 to 10, the 2,3,5,7 should be returned as prime numbers")
    void shouldReturnPrimeNumbersTest() {
        // Given
        var givenNumber = 10;

        // When
        List<Integer> primes = FindPrimeNumbers.find(givenNumber);

        // Then
        Assertions.assertThat(primes).containsExactly(2, 3, 5, 7);
    }
}
