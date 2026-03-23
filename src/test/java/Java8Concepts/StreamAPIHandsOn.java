package Java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Stream API in Java is used to process a collection of data (like List, Set, etc.)
in a simple and powerful way.

Instead of writing many lines of loops and conditions,
Stream API lets you filter, transform, and process data in one clean line of code. It was introduced in Java 8.
 */
public class StreamAPIHandsOn {
    public static void main(String[] args) {
        // 1 Simple Idea: think of stream like a pipeline of data
        // Data goes through steps like Filter, Map and Collect

        List<Integer> numbers = Arrays.asList(3,7,6,8,10,3);

        // Finding even numbers without using stream API
        List<Integer> evenNumbers =new ArrayList<>();
        for(int n:numbers){
            if(n%2==0){
                evenNumbers.add(n);
            }
        }
        System.out.println("even numbers: "+evenNumbers);

        // Finding even numbers with stream API
        List<Integer> evenNumbersUsingStream = numbers.stream().filter(n->n%2==0).toList();
        System.out.println("even numbers using stream: "+evenNumbersUsingStream);

    }
}
