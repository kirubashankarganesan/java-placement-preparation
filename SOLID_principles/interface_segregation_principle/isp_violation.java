package SOLID_principles.interface_segregation_principle;

// def: clients should not forced to depend on interfaves they do not use.
// it encourage more specific interfaces

// eg : robot is forced to implement the eat() even through it doesn't need it.

interface worker{
    void work();
    void eat();
}
class human implements worker{
    public void work(){
        System.out.println("human working...");
    }
    public void eat(){
        System.out.println("human eat");
    }
}
class robot implements worker{
    public void work(){
        System.out.println("robot working...");
    }
    public void eat(){
        throw new UnsupportedOperationException("robot does not eat");
    }
}
public class isp_violation {
    public static void main(String[] args) {
        human h=new human();
        h.work();
        h.eat();
        robot r=new robot();
        r.work();
        r.eat();
    }
}
