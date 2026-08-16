package oops.abstraction.abstract_concept;

abstract class computer {
    abstract void turnoff();

    // When a normal/concrete class extends an abstract class, it must implement all
    // the abstract methods of the abstract class.
    void turnon() {
        System.out.println("turning on");
    }
}
// abstract class ku obj create panna mudiyathu

class hp extends computer {
    @Override
    void turnon() {
        System.out.println("turning on hp");
    }

    @Override
    void turnoff() {
        System.out.println("hp is turnoff");
    }
}

 class dell extends computer {
    @Override
    void turnoff() {
        System.out.println("dell is turnoff");
    }
}

// When an abstract class extends another abstract class, it is not mandatory to implement the abstract methods.
abstract class asus extends computer{

}

public class abstract_class {
    public static void main(String[] args) {
        hp obj1 = new hp();
        obj1.turnon();
        obj1.turnoff();

        dell obj2 = new dell();
        obj2.turnon();
        obj2.turnoff();
    }
}
