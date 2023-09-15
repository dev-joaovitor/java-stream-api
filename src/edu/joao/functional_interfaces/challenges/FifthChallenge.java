package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class FifthChallenge {
    public static void main(String[] args) {
        /**
         * calculating the avg of
         * all numbers that are
         * higher than 5
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> higherThanFiveNumbers = numbers.stream()
                                        .filter(n -> n > 5)
                                        .toList();

        int result = (higherThanFiveNumbers.stream()
                        .reduce(0, Integer::sum)) / higherThanFiveNumbers.size();

        System.out.println(result);
    }
}
