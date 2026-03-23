package Java8Concepts;

import java.util.Arrays;
import java.util.List;

public class StreamAPIHandsOn1 {
    public static void main(String[] args) {
        // Intermediate Operations in Stream
        // Intermediate operations are steps that modify or filter data in a stream but do not produce the final result yet.

        // They return another stream, so we can chain multiple operations together.
        // Example flow: List → stream() → filter() → map() → sorted() → toList()

        // 1) map() is used to transform or change each element in the stream.
        System.out.println("Map examples ==========");
        List<String> names = Arrays.asList("shiv", "tony", "john");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // 2) filter() is used to select elements based on a condition.
        System.out.println("Filter examples ==========");
        names.stream().filter(name -> name.startsWith("s")).forEach(System.out::println);

        // 3) sorted() is used to sort elements. By default it sorts ascending order.
        System.out.println("Sorted examples ==========");
        List<Integer> numbers = Arrays.asList(2, 7, 0, 6, 3, 9, 4);
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("Custom Sorted examples ==========");
        numbers.stream().sorted((a, b) -> b - a).forEach(System.out::println);

        // 4) distinct() is used to remove duplicate elements.
        System.out.println("Distinct values example ==========");
        numbers.stream().distinct().forEach(System.out::println);

        // 5) peek() is used to look at elements in the stream without changing them
        // Mostly used for debugging.
        //It lets you print or log values while stream is processing.
        System.out.println("Peek example ==========");
        List<Integer> numbersList = Arrays.asList(2, 7, 0, 6, 3, 9, 4);
        numbersList.stream().
                peek(n-> System.out.println("original number"+n)).
                map(n->n*n).
                peek(n-> System.out.println("numbers square "+n)).
                forEach(System.out::println);
    }
}
