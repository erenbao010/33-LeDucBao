package OOP_java.day3;

import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
     private List<Employee> managedEmployees;
     public Manager(int employeeID, String name, String division, double salary) {
         super(employeeID, name, division, salary);
         this.managedEmployees = new ArrayList<>();
     }


     public void addManagedEmployee(Employee employee) {
         managedEmployees.add(employee);
     }




 }
