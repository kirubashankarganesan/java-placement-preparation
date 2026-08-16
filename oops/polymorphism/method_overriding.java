package oops.polymorphism;

// Method overriding occurs when a child class provides its own implementation of a 
// method that is already present in the parent class, with the same method name and parameters.


class Animal {
    void eat() {
        System.out.println("animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog can bark");
    }

    @Override
    void eat() {
        System.out.println("dog can eat");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("can make meow sound");
    }

}

public class method_overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        d.eat();
        c.meow();
        c.eat();
    }
}
