package operators;

public class ternary {
    public static void main(String[] args) {
         int age = 20;

        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible";

        System.out.println(result);   // Output: Eligible to Vote
    }
}
