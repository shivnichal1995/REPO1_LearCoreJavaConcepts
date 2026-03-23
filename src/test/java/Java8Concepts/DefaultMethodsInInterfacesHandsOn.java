package Java8Concepts;

/*
 * ==========================================================
 *            Default Methods in Java 8 Interfaces
 * ==========================================================
 *
 * Java 8 introduced a feature called "Default Methods" in interfaces.
 *
 * Default methods allow an interface to provide a method implementation
 * along with the method declaration.
 *
 * Why was this introduced?
 * ------------------------
 * It was added mainly to maintain backward compatibility.
 *
 * If a new method is added to an interface, existing classes that
 * implement that interface should not break. Default methods provide
 * a ready implementation so existing classes are not forced to change.
 */


/*
 * ==========================================================
 *                    Before Java 8
 * ==========================================================
 *
 * 1. Interfaces could only contain abstract methods.
 * 2. Methods had no body (no implementation).
 * 3. If a new method was added to an interface,
 *    every implementing class had to implement it.
 * 4. This could break existing applications because
 *    all implementing classes needed modification.
 */


/*
 * ==========================================================
 *                After Java 8 (Default Methods)
 * ==========================================================
 *
 * 1. Interfaces can contain methods with implementation.
 * 2. These methods are declared using the "default" keyword.
 * 3. Implementing classes are NOT required to override them.
 * 4. They can either:
 *      - Use the default implementation, OR
 *      - Provide their own implementation.
 */

interface A {

    // -------------------------------
    // Abstract Methods
    // -------------------------------
    void A_AbstractMethod();

    int Test1AbstractMethodInt();


    // -------------------------------
    // Default Methods
    // -------------------------------

    default void A_PrintMethod() {
        System.out.println("Interface A - Print Method");
    }

    default int A_AddMethod(int a, int b) {
        int result = a + b;
        System.out.println("Interface A - Add Method Result: " + result);
        return result;
    }
}


public class DefaultMethodsInInterfacesHandsOn implements A {

    // Implementing abstract methods from interface A

    @Override
    public void A_AbstractMethod() {
        System.out.println("Implemented abstract method from Interface A");
    }

    @Override
    public int Test1AbstractMethodInt() {
        return 0;
    }
}