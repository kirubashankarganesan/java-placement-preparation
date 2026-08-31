package SOLID_principles.liskov_substitution_principle;

abstract class bird1 {
    abstract void makesound();
}

interface flyingbird {
    void fly();
}

class sparrow1 extends bird1 implements flyingbird {
    public void makesound() {
        System.out.println("chirp chirp");
    }

    public void fly() {
        System.out.println("sparrow can flying ");
    }
}

class penguin1 extends bird1 {
    public void makesound() {
        System.out.println("penguin sound...");
    }
}

public class lsp_without_violation {
    public static void main(String[] args) {
        bird1 penguin = new penguin1();
        bird1 sparrow = new sparrow1();

        sparrow.makesound();
        penguin.makesound();

        flyingbird fb=new sparrow1();
        fb.fly(); // works without break;
    }
}
