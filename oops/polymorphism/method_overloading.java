package oops.polymorphism;



// "Method overloading is useful when we want to perform the same operation with
// different types or numbers of inputs. For example, a calculator can have
// multiple add methods with different parameters."

class polymorphism {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class method_overloading {
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();

        obj.sum(10, 20);
        obj.sum(10, 20, 30);
    }
}
