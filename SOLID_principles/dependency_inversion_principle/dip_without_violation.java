package SOLID_principles.dependency_inversion_principle;


interface keyboard{
    void connect();
}

class wiredkeyboard implements keyboard{
    public void connect(){
        System.out.println("wired connected");
    }
}
class wiredlesskeyboard implements keyboard{
    public void connect(){
        System.out.println("wireless connected");
    }
}

class computer{
    private keyboard keyboard;

    public computer(keyboard keyboard){
        this.keyboard=keyboard;
    }
    public void start(){
        keyboard.connect();
    }
}
public class dip_without_violation {
    public static void main(String[] args) {
        keyboard wired=new wiredkeyboard();
        computer pc1=new computer(wired);
        pc1.start();
        keyboard wiredless=new wiredkeyboard();
        computer pc2=new computer(wiredless);
        pc2.start();
    }
}
