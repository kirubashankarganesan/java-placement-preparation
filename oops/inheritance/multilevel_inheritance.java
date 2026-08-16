package oops.inheritance;

class Animal1 {
    void eat() {
        System.out.println("animal can eat");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("dog barks");
    }
}
class puppy extends Dog1 {
    @Override
    void bark() {
        System.out.println("puppy can bark");
    }
    void play() {
        System.out.println("puppy play");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        puppy p=new puppy();
        p.bark();
        p.eat();
        p.play();
    }
}
