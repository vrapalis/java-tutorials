package com.vrapalis.www.challenges.math;

import java.util.Arrays;

public class RunMath {
    public static void main(String[] args) {
        System.out.println("### Java mathematical challenges ##");

        // Get digits from number
        System.out.println("");
        var number = 123;
        System.out.println(String.format("## Get digits from %d number", number));
        Arrays.stream(
                        GetDigitsFromNumberUtils.getDigitsAsArrayFromNumber(number)
                )
                .forEach(digit -> System.out.println(String.format("Digit: %s", digit)));
        System.out.println("");
    }
}
