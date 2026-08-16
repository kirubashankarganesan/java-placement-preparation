package keywords.super_concept;
class super_variable_Animal {

    String name = "Animal";
}

class super_var_Dog extends super_variable_Animal {

    String name = "Dog";

    void display() {
        System.out.println(name); //dog
        System.out.println(super.name);  //animal
        // super.variable → Parent's variable
    }
}

public class super_variable {
    public static void main(String[] args) {

        super_var_Dog d = new super_var_Dog();
        d.display();
    }
}
