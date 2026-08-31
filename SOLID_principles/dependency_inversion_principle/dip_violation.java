package SOLID_principles.dependency_inversion_principle;

// def:  high level modules not depends on low level modules.
// both should depend on abstractions,not concrete implementations.

class wired_keyboard {
    public void connect() {
        System.out.println("wired keyboard ");
    }
}

// computer is tightly coupled to wired keyboard
class computer {
    private wired_keyboard keyboard = new wired_keyboard();

    public void start() {
        keyboard.connect();
    }
}

public class dip_violation {
    public static void main(String[] args) {
        computer pc = new computer();
        pc.start();
    }
}
