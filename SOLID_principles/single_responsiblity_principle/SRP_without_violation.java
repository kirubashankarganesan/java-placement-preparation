package SOLID_principles.single_responsiblity_principle;

class employee1 {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

// responsible only for salary calculation
class salaryCalculation {
    public double calculatesalary(employee1 employee) {
        return employee.getSalary() * 1.2;
    }
}

// responsible only for report generation
class reportgeneration {
    public void generatereport(employee1 employee) {
        System.out.println("generating report for" + employee.getName() + "...");
    }
}

public class SRP_without_violation {
    public static void main(String[] args) {
        employee1 emp=new employee1("kirubashankar", 50000);
        salaryCalculation cal=new salaryCalculation();
        reportgeneration report=new reportgeneration();
        System.out.println(cal.calculatesalary(emp));
        report.generatereport(emp);
    }
}
