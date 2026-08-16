package operators;

public class bitwise {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Bitwise AND
        System.out.println("a & b  = " + (a & b));

        // Bitwise OR
        System.out.println("a | b  = " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b  = " + (a ^ b));

        // Bitwise NOT
        System.out.println("~a     = " + (~a));

        // Left Shift
        System.out.println("a << 1 = " + (a << 1));

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1));

        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}
