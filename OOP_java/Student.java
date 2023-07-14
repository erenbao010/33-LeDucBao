package OOP_java;

public class Student {
    private int studentIds;
    private String name;
    private String gender;
    private String school;
    private String classes;

    
    public Student(String classes, String name, String gender, int studentId, String school) {
//        this.studentIds = studentIds;
//        this.school = school;
        this.classes = classes;
        this.name = name;
        this.gender= gender;
    }


    // method
    public void eat() {
        System.out.println("Student eats");
    }

    public void sleep() {
        System.out.println("Student sleep");
    }
    public int getstudentId(){
        return studentIds;
    }

//    public abstract void present();
//    public abstract void run();
//    public abstract void work_part_time();
}



