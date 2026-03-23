package Java8Concepts;

/*
 * ============================================================
 *  Java Interfaces Features Demonstration (Java 8 & Java 9)
 * ============================================================
 *
 * This single file demonstrates the following concepts:
 *
 * 1. Static Methods in Interfaces (Java 8)
 * 2. Functional Interfaces (Java 8) + Lambda Expressions
 * 3. Private Methods in Interfaces (Java 9)
 * 4. Private Static Methods in Interfaces (Java 9)
 * 5. Interface Constants (public static final by default)
 *
 * NOTE:
 * - Interfaces can contain multiple types of methods now.
 * - These features were introduced to make interfaces more powerful
 *   and backward compatible.
 */

public class InterfaceJava8UpdateMethods {

    /*
     * ============================================================
     * 1. STATIC METHODS IN INTERFACES (Java 8)
     * ============================================================
     *
     * Interfaces can now contain static methods with implementation.
     *
     * RULES:
     * - Static methods belong to the interface itself.
     * - They must be called using InterfaceName.methodName()
     * - They cannot be overridden by implementing classes.
     */

    interface MathUtils {

        // Static method inside interface
        static int add(int a, int b) {
            return a + b;
        }
    }

    /*
     * ============================================================
     * 2. FUNCTIONAL INTERFACE (Java 8)
     * ============================================================
     *
     * A Functional Interface contains ONLY ONE abstract method.
     *
     * It is mainly used with Lambda Expressions.
     *
     * The @FunctionalInterface annotation ensures that the interface
     * contains exactly one abstract method.
     */

    @FunctionalInterface
    interface Calculator {

        // Single abstract method
        int operate(int a, int b);

        // Default or static methods do NOT count as abstract methods
        default void showMessage() {
            System.out.println("Calculator operation executed.");
        }
    }

    /*
     * ============================================================
     * 3. PRIVATE METHODS IN INTERFACES (Java 9)
     * ============================================================
     *
     * Private methods are used inside interfaces to avoid
     * repeating code in multiple default methods.
     *
     * RULES:
     * - Can only be used inside the interface.
     * - Cannot be accessed by implementing classes.
     */

    interface MessageService {

        // Default method
        default void sendMessage() {
            logActivity();
            System.out.println("Sending message to user...");
        }

        // Another default method
        default void receiveMessage() {
            logActivity();
            System.out.println("Receiving message from user...");
        }

        // Private method used by default methods
        private void logActivity() {
            System.out.println("Private method: Logging message activity...");
        }
    }

    /*
     * ============================================================
     * 4. PRIVATE STATIC METHODS IN INTERFACES (Java 9)
     * ============================================================
     *
     * Private static methods are helper methods used internally
     * by other static methods inside the interface.
     */

    interface Helper {

        static void executeTask() {
            helperMethod();
            System.out.println("Executing main task...");
        }

        private static void helperMethod() {
            System.out.println("Running internal helper logic...");
        }
    }

    /*
     * ============================================================
     * 5. INTERFACE CONSTANTS
     * ============================================================
     *
     * Variables inside interfaces are automatically:
     *
     * public static final
     *
     * Even if we do not write these keywords, Java adds them
     * automatically.
     */

    interface Config {

        // This is automatically: public static final
        int MAX_USERS = 100;

        String APP_NAME = "Messaging Application";
    }

    /*
     * Class implementing MessageService interface
     * to demonstrate default and private methods behavior.
     */
    static class MessagingApp implements MessageService {
        // No need to implement anything because default methods already exist
    }

    /*
     * ============================================================
     * MAIN METHOD
     * ============================================================
     * This will demonstrate all concepts.
     */

    public static void main(String[] args) {

        System.out.println("=========== STATIC METHODS IN INTERFACE ===========");

        // Calling static methods using InterfaceName.method()
        int sum = MathUtils.add(5, 3);
        System.out.println("Addition: " + sum);


        System.out.println("\n=========== FUNCTIONAL INTERFACE WITH LAMBDA ===========");
        // Lambda expression implementing functional interface
        Calculator addition = (a, b) -> a + b;

        int result = addition.operate(10, 20);
        System.out.println("Lambda Addition Result: " + result);
        addition.showMessage();


        System.out.println("\n=========== PRIVATE METHOD IN INTERFACE ===========");
        MessagingApp app = new MessagingApp();

        // These methods internally call the private logActivity() method
        app.sendMessage();
        app.receiveMessage();


        System.out.println("\n=========== PRIVATE STATIC METHOD IN INTERFACE ===========");
        // Calling static method which internally calls private static method
        Helper.executeTask();


        System.out.println("\n=========== INTERFACE CONSTANTS ===========");
        // Accessing constants using InterfaceName.constant
        System.out.println("App Name: " + Config.APP_NAME);
        System.out.println("Max Users Allowed: " + Config.MAX_USERS);
    }
}