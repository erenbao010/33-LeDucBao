package OOP_java;

public class Main {
    public static void main(String[] args) {
////        Car car = new Car("Audi","green");
//        Car car = new SportCar("audi", "blue");
//        System.out.println(car);
////        car.start();
//       car.displayInfo();
//       car.speedExtend();
//    }
//        Car sportCar = new sportCar("audi");
//        sportCar.start();
//        sportCar.stop();
//        sportCar.drove(100);
//        Car sedan = new Sedan("ferrari");
//        sedan.drove(20);
//        sedan.stop();
//    }

        Student student1 = new collegeStudent(1, "Oxford", "4D","Female","Ly Gia Han");
        student1.eat();
        student1.sleep();
        int studentId = student1.getstudentId() ;
        System.out.println(studentId);
        Student student2 = new universityStudent(2, "MIT", "5B","Male","Duc Bao");
        student2.eat();
        student2.sleep();
    }
}
