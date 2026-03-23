package Java8Concepts;

/*
========================================
Functional Interface in Java (Java 8)
========================================

Definition (Simple Words):
A Functional Interface is an interface that contains
ONLY ONE abstract method.

Why is it important?
Functional interfaces are used with Lambda Expressions,
which were introduced in Java 8 to write shorter and
cleaner code.

Rules of Functional Interface:
1. It must have ONLY ONE abstract method.
2. It can have multiple default methods.
3. It can have multiple static methods.
4. It can have Object class methods like toString().

Example:
Runnable, Comparator, Callable are examples of
functional interfaces that existed even before Java 8.
*/

/*
Using @FunctionalInterface annotation is optional,
but recommended because it ensures that the interface
always has only one abstract method.
*/

@FunctionalInterface
interface Greeting {

    // Only ONE abstract method
    void sayHello();

    // Default method (allowed)
    default void sayGoodMorning() {
        System.out.println("Good Morning!");
    }

    // Static method (allowed)
    static void sayBye() {
        System.out.println("Bye!");
    }
}

public class FunctionalInterfacesHandsOn implements Greeting {

    // Implementing the abstract method
    public void sayHello() {
        System.out.println("Hello from class implementation!");
    }

    public static void main(String[] args) {

        System.out.println("----- Traditional Way -----");

        // Creating object of class
        FunctionalInterfacesHandsOn obj = new FunctionalInterfacesHandsOn();
        obj.sayHello();

        System.out.println("\n----- Using Lambda Expression -----");

        /*
        Lambda expression provides a shorter way to implement
        functional interfaces.
        */
        Greeting g = () -> System.out.println("Hello from Lambda!");

        g.sayHello();

        System.out.println("\n----- Calling Default Method -----");

        g.sayGoodMorning();

        System.out.println("\n----- Calling Static Method -----");

        Greeting.sayBye();


        System.out.println("\n----- Real World Example -----");

        /*
        Java 8 Streams and Collections use functional interfaces.
        Example: forEach() method
        */

        java.util.List<String> names =
                java.util.Arrays.asList("Rahul", "Anita", "John");

        names.forEach(name -> System.out.println(name));

        /*
        Here forEach() internally uses a functional interface
        called Consumer.

        Consumer Interface Example:
        Consumer<T> → accepts a value and performs an action.
        */
    }
}

/*
========================================
Key Points to Remember
========================================

1. Functional Interface = Interface with ONE abstract method.

2. Introduced officially in Java 8 along with Lambda expressions.

3. Annotation used:
   @FunctionalInterface

4. Can contain:
   ✔ One abstract method
   ✔ Multiple default methods
   ✔ Multiple static methods

5. Used heavily in:
   - Java Streams
   - Collection API
   - Multithreading
   - Event handling
*/