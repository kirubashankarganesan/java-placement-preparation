package keywords.final_concept;

class Students {

    final int id = 101;

    void display() {
        System.out.println(id);
    }
}

public class final_variable {
    public static void main(String[] args) {

        Students s = new Students();

        s.display();
        // s.id=102;  it cannot be possible
    }
}
