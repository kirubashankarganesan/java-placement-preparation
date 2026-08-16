package oops.create_objects;

class Applform {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }
}

public class create_objects {
    public static void main(String[] args) {
        Applform ks = new Applform();

        ks.name = "kirubashankar g";
        ks.rollno = 49;
        ks.display();

        Applform ck = new Applform();//it craete the copy 

        //  this gives the information to that
        ck.name = "chandrakanth g";
        ck.rollno = 23;
        ck.display();
    }

}
