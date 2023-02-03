package com.vrapalis.www.challenges.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("Real divider test")
public class RealDividerTest {

    @Test
    @DisplayName("6 should return 1,2,3 as real divider number test")
    void shouldReturnRealDividerTest() {
        // Given
        int givenNumber = 6;

        // When
        List<Integer> dividers = RealDivider.findDivisor(givenNumber);

        // Then
        Assertions.assertThat(dividers).containsExactly(1,2,3);
    }
}
