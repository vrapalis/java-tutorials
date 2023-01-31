package com.vrapalis.www.challenges.math;

import lombok.experimental.UtilityClass;

import java.util.Stack;

@UtilityClass
public class GetDigitsFromNumberUtils {

    static int[] getDigitsAsArrayFromNumber(final int number) {
        int length = String.valueOf(number).length();
        int[] digits = new int[length];

        int count = length - 1;
        int remainNumber = number;

        while (remainNumber > 0 && count >= 0) {
            var digit = remainNumber % 10;
            remainNumber = remainNumber / 10;
            digits[count] = digit;
            count--;
        }

        return digits;
    }
}
