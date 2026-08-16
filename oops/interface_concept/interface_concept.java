package oops.interface_concept;


interface father{
     void call();
    abstract void talk();

    // Any class that implements Animal must have eat() and sound() methods.
}

class Interface implements father{
    public void call(){
        System.out.println("calling");
    }
    // @Override
    public void talk(){ 
         //we has to put public before void while implements the interface  to tell we are overiding the abstract method
        System.out.println("talking");
    }
}
public class interface_concept {
    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.call();
        obj.talk();
    }
}
