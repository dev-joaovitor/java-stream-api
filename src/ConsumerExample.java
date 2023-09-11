import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // declaring a consumer
        Consumer<Integer> printEvenNumbers = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };

        // stream for each receiving a consumer
        numbers.stream().forEach(printEvenNumbers);

        // printing odd numbers without declaring a consumer
        numbers.stream().forEach(number -> {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        });
    }
}
