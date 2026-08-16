package oops.inheritance;

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

public class hierarchical_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        d.eat();
        c.meow();
        c.eat();
    }
}
