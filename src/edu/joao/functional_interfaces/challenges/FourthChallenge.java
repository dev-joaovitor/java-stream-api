package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class FourthChallenge {
    public static void main(String[] args) {
        // removing all the odd numbers

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 == 0)
                        .toList()
        );
    }
}
