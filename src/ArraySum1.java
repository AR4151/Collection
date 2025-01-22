import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySum1 {

        public static void findPairs(int[] array, int targetSum) {

            HashSet<Integer> seenNumbers = new HashSet<>();

            System.out.println("Pairs with sum " + targetSum + ":");

            List<Integer> numbers = IntStream.of(array).boxed().collect(Collectors.toList());

            numbers.stream()
                    .flatMap(num -> numbers.stream()
                            .filter(other -> num + other == targetSum && num < other)
                            .map(other -> new int[]{num, other}))
                    .forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));


        }

        public static void main(String[] args) {
            int[] array = {4, 5, 7, 11, 9, 13, 8, 12};
            int targetSum = 20;

            findPairs(array, targetSum);
        }
    }


