package edu.joao.functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> doubleNum = num -> num * 2;

        List<Integer> doubledNums = nums.stream()
                .map(doubleNum)
                .collect(Collectors.toList()); // or just .toList();

        List<Integer> doubledNums2 = nums.stream()
                .map(
//                    new Function<Integer, Integer>() {
//                        @Override
//                        public Integer apply(Integer num) {
//                            return num * 2;
//                        }
//                    }
                        num -> num * 2 // lambda
                )
                .collect(Collectors.toList()); // or just .toList();
//        System.out.println(doubledNums);
        doubledNums2.stream().forEach(System.out::println);
    }
}
