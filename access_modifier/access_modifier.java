package access_modifier;

class app {
    private String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setvalue(String str,int num){
        name=str;
        rollno=num;
    }

    public String getval(){
        return name;
    }
}

public class access_modifier {
    public static void main(String[] args) {
        app ks = new app();

        ks.setvalue("kirubashankar g", 49);
        ks.display();

        app ck = new app();// it craete the copy

        // this gives the information to that
        // ck.name = "chandrakanth g";
        String sss=ck.getval();
        System.out.println(sss);
        ck.rollno = 23;
        // ck.display();
    }

}
// setter function is used to pass the value
// getter function is used to get the value