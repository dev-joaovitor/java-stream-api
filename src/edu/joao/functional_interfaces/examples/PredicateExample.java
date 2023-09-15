package edu.joao.functional_interfaces.examples;

import java.util.Arrays;
import java.util.List;

public class PredicateExample
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList(
                "java", "kotlin", "python", "javascript", "c", "go", "ruby");

        words.stream()
                .filter(w -> w.length() < 5)
                .forEach(System.out::println);
    }
}
