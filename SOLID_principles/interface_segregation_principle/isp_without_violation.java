package SOLID_principles.interface_segregation_principle;


interface worker{
    void work();
    
}
interface eatable{
    void eat();
    
}
class human implements worker,eatable{
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
}
public class isp_without_violation {
        public static void main(String[] args) {
        human h=new human();
        h.work();
        h.eat();
        
        robot r=new robot();
        r.work();
    
    }
}
