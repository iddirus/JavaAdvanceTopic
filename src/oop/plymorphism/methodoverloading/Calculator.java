package oop.plymorphism.methodoverloading;

import java.util.Scanner;

public class Calculator {

    // compile time / method overloading
    // method name should be the same
    // the signature pattern make the difference between method

    // create some methods
    // non static method
    public void employeeInfo(){
        System.out.println("this is employee information method");
    }
    public void employeeInfo(String firstName){
        System.out.println("Employee first Name is "+firstName);
    }
    public void employeeInfo(String firstName,String lastName){
        System.out.println("employee first name is "+firstName+ " "+ "employee last name is "+lastName);
    }
    public void employeeInfo(String firstName,String lastName,double courseFee){
        System.out.println("employee first name is "+firstName+ " "+ "employee last name is "+lastName+ " "+ "employee course fee "+courseFee);
    }
    // static method

    public static void doSum(){
     int number1=14;
     int number2= 45;
     int total=number1+number2;
        System.out.println("total is "+total);
    }
    public static void doSum(int number1,int number2){
        int total= number1+number2;
        System.out.println("total summation is "+total);
    }
    public static void doSum(int number1,int number2, int number3){
        int total = number1+ number2+ number3;
        System.out.println("total is "+total);
    }
    public static void doSum(int number1,int number2,int number3,int number4){
        int total = number1+number2+number3+number4;
        System.out.println("total "+total);
    }





}
