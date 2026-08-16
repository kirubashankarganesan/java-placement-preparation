package exception_handling.unchecked;

class cal{
    void display() throws Exception{
        int a=10/0;
        System.out.println(a);
    }
}
public class exception_ex3 {
    public static void main(String[] args) {
        cal c=new cal();
        try {
            c.display();
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
