package operators;

public class shift {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a << 1); // Output: 10
        System.out.println(a << 2); // Output: 20
        System.out.println(a << 3); // Output: 40

        int a1 = 20;

        System.out.println(a1 >> 1); // Output: 10
        System.out.println(a1 >> 2); // Output: 5
        System.out.println(a1 >> 3); // Output: 2

         int a2 = -20;

        System.out.println(a2 >>> 1);


    }
}
