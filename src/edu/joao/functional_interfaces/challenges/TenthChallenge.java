package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class TenthChallenge {
    public static void main(String[] args) {
        /**
         * printing out
         * all the odd numbers
         * in the list
         * that are multiple
         * of 3 or 5
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> resultNumbers = numbers.stream()
                .filter(number -> number % 2 == 1 && (number % 3 == 0 || number % 5 == 0))
                .toList();

        System.out.println(resultNumbers);


    }
}
