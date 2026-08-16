package constructor;

class sample1 {
    int rollno;
    int marks;

    sample1(int roll,int marks) {
        rollno=roll;
        marks=this.marks;
    }
}

public class parameterised_constructor {
    public static void main(String[] args) {
        sample1 obj = new sample1(49,100);
        System.out.println(obj.rollno);
    }
}
