package keywords.super_concept;
class super_Animal {

    super_Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends super_Animal {

    Dog() {
        super();// animal constructor
        System.out.println("Dog constructor"); // Dog constructor
        // If you don't write super() explicitly, Java automatically inserts it as the
        // first statement of the child constructor, provided the parent has an
        // accessible no-argument constructor.
    }

    void display() {
        System.out.println("dog class");
    }
}

public class super_constructor {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}
