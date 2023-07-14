package OOP_java.day3;

import java.util.ArrayList;
import java.util.List;

class Engineer extends Employee {
     private List<String> skills;

     public Engineer(int employeeID, String name, String division, double salary) {
         super(employeeID, name, division, salary);
         this.skills = new ArrayList<>();
     }


    public void addSkill(String skill) {
        skills.add(skill);
        System.out.println("Skill"+ skill);
    }
    public List<String> get_skills() {
        return skills;
    }
    public void removeSkill(String skill) {
        skills.remove(skill);
    }
 }
