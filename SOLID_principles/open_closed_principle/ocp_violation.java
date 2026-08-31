package SOLID_principles.open_closed_principle;

// software entities should be open for extension but closed for modification.
//  This allows adding new function without altering existing code

// explanation: oru software ready panna athula edit pannama (modification) instead of that feature mattum add pannanum
// eg: if client want to add the extra shape we are editing this by adding extra else if 
class Areacalculate {
    public double calculate_area(String shape, double radius, double length, double breadth) {
        if (shape.equals("circle")) {
            return Math.PI * radius * radius;
        } else if (shape.equals("rectangle")) {
            return length * breadth;
        }
        return 0;
    }
}

public class ocp_violation {

    public static void main(String[] args) {
        Areacalculate cal = new Areacalculate();
        System.out.println("circle area: " + cal.calculate_area("circle", 5, 0, 0));
    }
}
