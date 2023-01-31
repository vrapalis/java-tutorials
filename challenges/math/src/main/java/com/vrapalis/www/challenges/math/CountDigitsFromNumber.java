package com.vrapalis.www.challenges.math;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CountDigitsFromNumber {

    public static int count(int number) {
        var remain = number;
        var count = 0;
        while (remain > 0) {
            remain = remain / 10;
            count++;
        }
        return count;
    }
}
