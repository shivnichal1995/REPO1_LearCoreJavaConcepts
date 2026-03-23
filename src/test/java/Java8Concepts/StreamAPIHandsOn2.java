package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIHandsOn2 {
    /*
    Terminal operations are the final step of a Stream.
    They produce the final result and end the stream pipeline.
    After a terminal operation runs, the stream cannot be used again.
     */
    public static void main(String[] args) {
        // 1) collect() is used to convert the stream result into a collection like List, Set, Map etc.
        // Usually we use it to store the processed data.
        List<Integer> numbers = Arrays.asList(2,7,8,0,4,6,7,8);
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
