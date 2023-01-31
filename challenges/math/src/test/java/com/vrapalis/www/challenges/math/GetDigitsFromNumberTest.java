package com.vrapalis.www.challenges.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

@DisplayName("Get digits from number test")
public class GetDigitsFromNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {123, 456})
    @DisplayName("Return digits as array from number test")
    void shouldReturnDigitsAsArrayFromNumberTest(int number /* Given number*/) {
        // When extracting digits from number
        int[] digits = GetDigitsFromNumberUtils.getDigitsAsArrayFromNumber(number);
        var sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        int result = Integer.valueOf(sb.toString());

        // Then result should be equals to given number
        Assertions.assertThat(result).isEqualTo(number);
    }
}
