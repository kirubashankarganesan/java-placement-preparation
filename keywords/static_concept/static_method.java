package keywords.static_concept;

class Calculatormethod {

    static void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class static_method {

    public static void main(String[] args) {
        Calculatormethod.add(10, 20);
    }
}