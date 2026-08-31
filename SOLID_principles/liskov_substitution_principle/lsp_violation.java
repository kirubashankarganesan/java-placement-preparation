package SOLID_principles.liskov_substitution_principle;

// def: Liskov Substitution Principle (LSP): Objects of a superclass 
// should be replaceable with objects of its subclasses without affecting 
// the correctness of the program.

class bird {
    public void fly() {
        System.out.println("flying...");
    }
}

class sparrow extends bird {
    @Override
    public void fly() {
        System.out.println("Sparrow can fly...");
    }
}

class penguin extends bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("penguins can't fly");
    }
}

public class lsp_violation {
    public static void main(String[] args) {
        bird penguin = new penguin();
        bird sparrow = new sparrow();

        sparrow.fly();
        penguin.fly(); // this will break at runtime
    }
}
