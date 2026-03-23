package Java8Concepts;

/*
 * ==========================================================
 *      Multiple Interface Conflict (Diamond Problem)
 * ==========================================================
 *
 * In Java 8, interfaces can contain default methods.
 *
 * Problem occurs when a class implements multiple interfaces
 * that contain the SAME default method with the SAME signature.
 *
 * Java compiler cannot decide which interface method to use.
 * This situation is called the "Diamond Problem".
 *
 * To resolve this conflict, the implementing class MUST
 * override the method and provide its own implementation.
 */


/*
 * Interface C contains a default implementation of show()
 */
interface C {
    default void show() {
        System.out.println("Show method from Interface C");
    }
}


/*
 * Interface B also contains a default implementation of show()
 * with the same method signature.
 */
interface B {
    default void show() {
        System.out.println("Show method from Interface B");
    }
}


/*
 * This class implements both interfaces B and C.
 *
 * Since both interfaces provide the same default method show(),
 * Java does not know which implementation to use.
 *
 * Therefore, the class MUST override the show() method
 * to resolve the conflict.
 */
public class DefaultMethodsInInterfacesHandsOnMultipleInheritance implements C, B {

    /*
     * Overriding show() method to resolve the conflict.
     * Now the compiler will use this implementation.
     */
    @Override
    public void show() {
        System.out.println("Conflict solved..!!");
    }


    /*
     * Main method to test the implementation
     */
    public static void main(String[] args) {

        // Creating object of the class
        DefaultMethodsInInterfacesHandsOnMultipleInheritance d =
                new DefaultMethodsInInterfacesHandsOnMultipleInheritance();

        // Calling the overridden show() method
        d.show();
    }
}