package exception_handling.unchecked;

public class exception_ex2 {
    static void check(int age){
        if(age<18){
            throw new ArithmeticException("age invalid");
        }
    }
 public static void main(String[] args) {
    // int val=5;
    try{
        check(17);
        System.out.println("success");
    }catch(ArithmeticException e){
        System.out.println(e);//java.lang.ArithmeticException: age invalid
        System.out.println(e.getMessage());// age invalid
    }
 }   
}
