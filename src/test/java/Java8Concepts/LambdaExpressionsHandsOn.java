package Java8Concepts;

import java.util.Arrays;
import java.util.List;

/*
What are Lambda Expressions in Java 8?
* A Lambda Expression is a short way to write a function (method) without giving it a name.
* It lets you pass behavior (code) as data.

Think of it like:
* “Instead of writing a full method, just write the logic directly where it is needed.”
* Lambda expressions were introduced in Java 8 mainly to make programming easier with collections, streams, and functional programming style.

Syntax:(parameters) -> { body }

*/
interface Add {
    int sum(int a, int b);
}

public class LambdaExpressionsHandsOn {
    public static void main(String[] args) {

        // 1) Lambda with single/multiple parameters
        Add add = (a, b) -> a + b;
        System.out.println(add.sum(3, 4));
        // This is the lambda function implementation.
        // Equivalent traditional code would be:

        Add add1 = new Add() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // if there are multiple lines then use { like:
        Add add2 = (a,b)->{
            int addition = a+b;
            return addition;
        };

        // 2) Lambda with collections
        List<Integer> numbers = Arrays.asList(1,3,5,7,9,4,2);

        // without lambda
        for(Integer n:numbers){
            System.out.println(n);
        }

        // with lambda
        numbers.forEach(n-> System.out.println(n));
    }
}
