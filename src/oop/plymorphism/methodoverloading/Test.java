package oop.plymorphism.methodoverloading;

public class Test {

    public static void main(String[] args) {
        // create object of calculator class
        Calculator calculator = new Calculator();
        calculator.employeeInfo();
        calculator.employeeInfo("joe");
        calculator.employeeInfo("marc", "daniel");
        calculator.employeeInfo("iddir", "hadjal", 3500.50);
        System.out.println("********second Approach***************************");
        Calculator.doSum();
        Calculator.doSum(25, 45);
        Calculator.doSum(23, 12, 78);
        Calculator.doSum(14, 45, 65, 1);


    }

}
