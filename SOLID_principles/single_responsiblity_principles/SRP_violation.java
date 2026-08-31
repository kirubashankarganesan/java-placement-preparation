package SOLID_principles.single_responsiblity_principles;

// def : a class should have only one reason to change, meaning it should have only one job or responsibility 

// violation SRP : this class has multiple responsibilities (salary calculation & report generation)
class employee {
    private String name;
    private double salary;

    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculatesalary() {
        return salary * 1.2;
    }

    public void generatereport() {
        System.out.println("generating report for" + name);
    }
}

public class SRP_violation {
    public static void main(String[] args) {
        employee emp = new employee("kirubashankar", 50000);
        System.out.println(emp.calculatesalary());
        emp.generatereport();

    }
}
