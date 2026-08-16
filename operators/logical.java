package operators;

public class logical {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age >= 18 && age <= 25);//true

        int marks = 85;
        System.out.println(marks > 90 || marks > 80);//true

        boolean isStudent = true;
        System.out.println(!isStudent);// false
    }
}
