package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class SeventhChallenge {
    public static void main(String[] args) {
        /**
         * finding the second-highest
         * number in the list
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 15, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> sortedNumbers = numbers.stream()
                        .sorted()
                        .toList();

        System.out.println(sortedNumbers.get(sortedNumbers.size()-2));
    }
}
