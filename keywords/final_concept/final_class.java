package keywords.final_concept;

final class final1_Animal4 {

    void eat() {
        System.out.println("Animal eats");
    }
}

// ❌ Cannot extend final class
// class Dog extends Animal {
// }
public class final_class {
    public static void main(String[] args) {
        final1_Animal4 a=new final1_Animal4();
        a.eat();
    }
}
