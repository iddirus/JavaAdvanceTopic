package oop.plymorphism.methodoverriding;

public interface Plane {
    // interface is guideline proto type for future use or a road map/ plan for further development
    // is 100% abstract
    // rules:
    // declare a variable
    // int age;
    // 1. we can not declare a variable in interface
    // 2. we can declare a variable and assign value/ instantiate variable
    String plane = "Boeing";

    // declare some variables and assign value
    String brand = "B347";
    int seats = 450;
    int turbineEngine = 4;
    int wings = 2;

    // declare method with body
    // we are allowed to use public access modifier only
    // public void planeName(){} // we can not declare method with body in interface

    // Declare methods/ properties of a plane
    public void planeCockpit();
    public void planeRudder();
    public void planeElevator();
    public void planeEngine();
    public void planeFuselage();

    // create main method: it's doable

    //    public static void main(String[] args) {
    //        System.out.println("good afternoon ");
    //    }

    // create an object
    // Plane plane = new Plane(); // we can not create object of class in interface


}
