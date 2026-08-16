package oops.inheritance;

class single_Animal1{
    void eat(){
        System.out.println("animal can eat");
    }
}

class single_Dogs extends single_Animal1{
    void bark(){
        System.out.println("dog barks");
    }
}


public class single_inheritance {
    public static void main(String[] args) {
        single_Dogs d=new single_Dogs();
        d.eat();
        d.bark();
    }
}
