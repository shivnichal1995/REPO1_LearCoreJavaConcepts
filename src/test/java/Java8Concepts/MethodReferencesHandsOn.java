package Java8Concepts;

/*
    Method references allow us to refer to a method without invoking it,
    making our code cleaner and more readable. They can be used in
    place of a lambda expression when the lambda expression only calls an existing method.
 */

import java.util.Arrays;
import java.util.List;

public class MethodReferencesHandsOn {
    public static void print(String m){
        System.out.println(m);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("tony","jacob","tom");
        students.forEach(MethodReferencesHandsOn::print);
        // here we referred to a print method inside MethodReferencesHandsOn class
    }
}
