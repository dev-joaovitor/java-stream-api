package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class ThirdChallenge {
    public static void main(String[] args) {
        /**
         * checking if all the numbers
         * on the list are
         * positive
         */

//        List<Integer> numbers = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10, 5, 4, 3); false
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); // true

        System.out.println("are all the numbers of the list positive?\n");

        boolean result = numbers.stream().allMatch(number -> number >= 0);

        System.out.println("ans: "+ (result ? "yes" : "no"));
    }
}
