package operators;

public class unary {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Original Value : " + a); // Output: Original Value : 10

        // Unary Plus
        System.out.println("Unary Plus (+a) : " + (+a)); // Output: Unary Plus (+a) : 10

        // Unary Minus
        System.out.println("Unary Minus (-a) : " + (-a)); // Output: Unary Minus (-a) : -10

        // Pre Increment
        System.out.println("Pre Increment (++a) : " + (++a)); // Output: Pre Increment (++a) : 11

        // Post Increment
        System.out.println("Post Increment (a++) : " + (a++));// Output: Post Increment (a++) : 11
        System.out.println("Value After Post Increment : " + a); // Output: Value After Post Increment : 12

        // Pre Decrement
        System.out.println("Pre Decrement (--a) : " + (--a)); // Output: Pre Decrement (--a) : 11

        // Post Decrement
        System.out.println("Post Decrement (a--) : " + (a--));// Output: Post Decrement (a--) : 11
        System.out.println("Value After Post Decrement : " + a); // Output: Value After Post Decrement : 10

        boolean result = true;

        // Logical NOT
        System.out.println("Logical NOT (!result) : " + (!result)); // Output: Logical NOT (!result) : false

    }
}
