package edu.joao.functional_interfaces.challenges;

import java.util.Arrays;
import java.util.List;

public class EleventhChallenge {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numbers = Arrays.asList(2,2);

        double result = numbers.stream().reduce();

        System.out.println(result);
    }
}
