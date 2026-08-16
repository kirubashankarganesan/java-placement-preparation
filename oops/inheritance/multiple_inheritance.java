package oops.inheritance;

interface father {
    void display();
}

interface mother {
    void display();
}

class son implements father, mother {
    // when we override the abstract method in multiple inheritance then we should
    // keep the "public" key word
    public void display() {
        System.out.println("son implements the father and mother");
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        son s = new son();
        s.display();
    }
}
