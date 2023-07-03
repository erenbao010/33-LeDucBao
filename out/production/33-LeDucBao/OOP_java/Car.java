package OOP_java;
//
//public abstract class Car {
//    private String brand;
//    private String color;
//
//    // constructor
//    public Car(String brand, String color) {
//        this.brand = brand;
//        this.color = color;
//    }
//
//    // methods
//    public void drive() {
//        System.out.println("The car drive");
//    }
//
////    public void start() {
////        System.out.println("The car start");
////    }
//
//    // abstract
//    public abstract void speedExtend();
//
//    public void displayInfo() {
//        System.out.println("The car brand " + brand);
//        System.out.println("COLOR IS" + color);
//    }
//}
//    class SportCar extends Car {
//        public SportCar(String brand, String color){
//            super(brand,color);
//        }
//        @Override
//        public void speedExtend(){
//            System.out.println("Speed sport Car");
//        }
//    }
class sportCar implements Car{
    private String brand;

public sportCar(String brand){
    this.brand = brand;
}
@Override
public void start(){
    System.out.println(brand+ " sports car roar");
}
@Override
public void stop(){
    System.out.println(brand+ "Car has stopped");
}
@Override
public void drove (double distance){
    System.out.println(brand+ " car drive " + distance);
}}
interface Car {
    void start();
    void stop();
    void drove (double distance);
}
class Sedan implements Car {
    private String brand;

public Sedan (String brand){
this.brand = brand;
}
@Override
     public void  start() {
    System.out.println(brand+ "Seden starting smooth");
}
@Override
    public void stop(){
    System.out.println(brand + "Sedan stop");
}
@Override
    public void drove (double distance){
    System.out.println(brand + "Sedan drive"+ distance+ " km");
}
}