package oops.create_objects;

class app {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setvalue(String str,int num){
        name=str;
        rollno=num;
    }
}

public class parameter_to_class {
    public static void main(String[] args) {
        app ks = new app();

        ks.setvalue("kirubashankar g", 49);
        ks.display();

        app ck = new app();// it craete the copy

        // this gives the information to that
        ck.name = "chandrakanth g";
        ck.rollno = 23;
        ck.display();
    }

}
