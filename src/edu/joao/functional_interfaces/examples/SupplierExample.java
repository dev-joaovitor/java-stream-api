package edu.joao.functional_interfaces.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greeting = () -> "Hello, you're welcome";

        List<String> greetingList = Stream.generate(greeting)
                .limit(5)
                .toList();

        greetingList.forEach(System.out::println);
    }
}
