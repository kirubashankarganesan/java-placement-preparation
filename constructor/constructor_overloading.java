package constructor;

class Student {

    Student() {
        System.out.println("No argument constructor");
    }

    Student(int id) {
        System.out.println("Student ID: " + id);
    }

    Student(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {

        // Student s1=new Student();
        new Student(101);
        new Student(101, "Kiruba");
        // if you dont want any warning so use the above method to call the constructor
        // Student s1 = new Student();
        // Student s2 = new Student(101);
        // Student s3 = new Student(101, "Kiruba");

    }
}