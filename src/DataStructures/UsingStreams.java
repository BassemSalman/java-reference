import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaredOddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter out even numbers
                .map(n -> n * n) // Square the odd numbers
                .collect(Collectors.toList()); // Collect the result into a new list

        System.out.println(squaredOddNumbers); // Output: [1, 9, 25, 49, 81]

    }
}
