package edu.joao.functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;

        int result = numbers.stream()
//                .reduce(0, sum);
//                .reduce(0,
//                        new BinaryOperator<Integer>() {
//                            @Override
//                            public Integer apply(Integer num1, Integer num2) {
//                                return num1 + num2;
//                            }
//                        });
//                  .reduce(0, Integer::sum);
                .reduce(0, (num1, num2) -> num1 + num2); // lambda

        System.out.println("The numbers sum is: " + result);
    }
}
