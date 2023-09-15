package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class SixthChallenge {
    public static void main(String[] args) {
        /**
         * printing out
         * if there's some number
         * that's higher than
         * 10 in the list
         */

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); false
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 14, 7, 8, 25, 10, 5, 4, 3); // true

        boolean result = numbers.stream()
                .anyMatch(number -> number > 10);

        System.out.println("ans: " + (result ? "yes" : "no"));
    }
}
