package com.vrapalis.www.challenges.math;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class RealDivider {

    static List<Integer> findDivisor(int number) {
        var dividers = new ArrayList<Integer>();

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                dividers.add(i);
            }
        }
        return dividers;
    }
}
