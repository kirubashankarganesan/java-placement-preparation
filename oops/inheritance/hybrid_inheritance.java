package oops.inheritance;

class Animal2{
    void eat(){
        System.out.println("animal can eat");
    }
}
class Dog2 extends Animal2{
    void bark(){
        System.out.println("dog can bark");
    }
}

class cat extends Animal2{
    void meow(){
        System.out.println("cat make meow sound");
    }
}
class puppy1 extends Dog2{
    void play(){
        System.out.println("puppy can play");
    }
}
public class hybrid_inheritance {
    public static void main(String[] args) {
        puppy1 p=new puppy1();
        cat c=new cat();
        p.eat();
        p.bark();
        p.play();
        c.meow();

    }
}
