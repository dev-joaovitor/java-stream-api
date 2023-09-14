import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // declaring a consumer
        Consumer<Integer> printEvenNumbers = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };

        // stream for each receiving a consumer
        numbers.stream().forEach(printEvenNumbers);

        // printing odd numbers without declaring a consumer
        // and using filter with predicate
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);
    }
}
