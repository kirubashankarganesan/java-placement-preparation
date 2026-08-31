package SOLID_principles.dependency_inversion_principle;

interface keyboard {
    void connect();
}

class wiredkeyboard implements keyboard {
    public void connect() {
        System.out.println("wired connected");
    }
}

class wiredlesskeyboard implements keyboard {
    public void connect() {
        System.out.println("wireless connected");
    }
}

class computer1 {
    private keyboard keyboard;

    public computer1(keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start() {
        keyboard.connect();
    }
}

public class dip_without_violation {
    public static void main(String[] args) {
        keyboard wired = new wiredkeyboard();
        computer1 pc1 = new computer1(wired);
        pc1.start();
        keyboard wireless = new wiredlesskeyboard();
        computer1 pc2 = new computer1(wireless);
        pc2.start();
    }
}
