package constructor;

class sample{
    int rollno;
    int marks;
    sample(){
        System.out.println("this is default constructor");
        rollno=49;// default value
        marks=100;
    }
}
public class constructor {
    public static void main(String[] args) {
        sample obj=new sample();
        System.out.println(obj.rollno); // instead of garbage value it gives 0 

    }
}
