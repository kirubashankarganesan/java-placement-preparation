package keywords.final_concept;

class Animals5 {

    final void eat() {
        System.out.println("Animal eats");
    }
}

class Dogss extends Animals5 {

    // ❌ Cannot override final method
    // void eat() {
    //     System.out.println("Dog eats");
    // }
}

public class final_method {
    public static void main(String[] args) {

        Animals5 a=new Animals5();

        a.eat();

    }
}
