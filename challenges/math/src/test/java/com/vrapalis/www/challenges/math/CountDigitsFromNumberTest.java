package com.vrapalis.www.challenges.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Count digits from number test")
public class CountDigitsFromNumberTest {

    @Test
    @DisplayName("Should count digits from given number test")
    void shouldCountDigitsFromNumberTest() {
        // Given number
        final var number = 123;

        // When
        final var result = CountDigitsFromNumber.count(number);

        // Then
        Assertions.assertThat(result).isEqualTo(3);
    }
}
