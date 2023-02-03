package com.vrapalis.www.challenges.math;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class FindPrimeNumbers {

    static List<Integer> find(final int givenRangeNumber) {
        var primers = new ArrayList<Integer>();

        for (int i = 2; i < givenRangeNumber; i++) {
            if (isPrime(i)) {
                primers.add(i);
            }
        }
        return primers;
    }

    private static boolean isPrime(int potentiallyPrime) {
        for (int i = 2; i <= potentiallyPrime / 2; i++) {
            if (potentiallyPrime % i == 0)
                return false;
        }
        return true;
    }
}
