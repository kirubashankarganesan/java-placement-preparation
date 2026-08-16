package keywords.this_concept;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class this_concept {
    public static void main(String[] args) {

        Student s = new Student("Kiruba", 21);

        s.display();
    }
}
