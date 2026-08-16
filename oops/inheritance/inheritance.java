package oops.inheritance;

class Animals{
    void eat(){
        System.out.println("animal can eat");
    }
}

class dog extends Animals{
    void bark(){
        System.out.println("dog can bark");
    }
}
public class inheritance {
    public static void main(String[] args) {
        dog obj=new dog();
        obj.bark();
        obj.eat();

    }
}
