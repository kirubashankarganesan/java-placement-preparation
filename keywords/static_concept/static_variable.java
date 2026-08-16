package keywords.static_concept;

class Student {

    static String college = "NGP";
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class static_variable {
    public static void main(String[] args) {

        Student s1 = new Student("kiruba");
        Student s2 = new Student("shankar");

        s1.display();
        s2.display();
    }
}
