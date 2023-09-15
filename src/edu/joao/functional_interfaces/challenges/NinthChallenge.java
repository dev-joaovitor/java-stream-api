package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NinthChallenge {
    public static void main(String[] args) {
        /**
         * check for duplicates
         * in the list
         */

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); // true
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Set<Integer> set = new HashSet<Integer>();

        List<Integer> duplicates = numbers.stream()
                .filter(number -> !set.add(number))
                .toList();

        System.out.println("there are duplicates?");
        System.out.println(duplicates);
        System.out.println("ans: " + (duplicates.size() > 0 ? "yes" : "no"));
    }
}
