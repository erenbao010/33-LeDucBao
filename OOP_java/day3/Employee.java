package OOP_java.day3;

public class Employee {
    private int employeeID;
    private String name;
    private String division;
    private double salary;

    public Employee(int employeeID, String name, String division, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.division = division;
        this.salary = salary;
    }

    // method
    public double get_salary(){
        return salary;
    }
}
