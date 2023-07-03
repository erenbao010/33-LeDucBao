package OOP_java.day3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John Smith", "John Smith",20.000);
        System.out.println("Employee 1 Salary: " + employee1.get_salary());

        Manager manager1 = new Manager(2, "Jane Doe", "Jane Doe",100.000);
        manager1.addManagedEmployee(employee1);
        System.out.println("Manager 1 Salary: " + manager1.get_salary());

        Engineer engineer1 = new Engineer(3, "Bao dep trai", "Dev",60.000);
        Engineer engineer2 = new Engineer(4,"Bao","a",50.000);
        Employee e1 = new Engineer(3,"a","a",500.00);

        engineer2.addSkill("Python");
        engineer2.addSkill("Java");
        System.out.println("Engineer 1 Salary: " + engineer1.get_salary());

        List<String> skills = engineer2.get_skills();
        for (String skill : skills) {
            System.out.println("Skill engineer is " + skill);
        }
    }
}
