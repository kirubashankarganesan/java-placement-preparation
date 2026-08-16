package keywords.super_concept;
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class super_Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        sound();  //dog barks
        super.sound();  //animal makes sound
        // super.method() → Parent's method
    }
}
public class super_method {
     public static void main(String[] args) {

        super_Dog d = new super_Dog();
        d.display();
    }
}
