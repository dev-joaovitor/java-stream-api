package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class SecondChallenge {
    public static void main(String[] args) {
        /**
         * printing out the result
         * of the sum of all
         * even numbers on the
         * list
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
