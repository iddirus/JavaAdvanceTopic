package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {

    public static void main(String[] args) {

        // first approach
//        int noteObtained = 72;
//
//        if (noteObtained >= 90) {
//            System.out.println("you got A+");
//        } else if (noteObtained >= 80) {
//            System.out.println("you got A");
//        } else if (noteObtained >= 70) {
//            System.out.println("you got B+");
//        } else if (noteObtained >= 60) {
//            System.out.println("you got B");
//        } else {
//            System.out.println("you are fail");
//        }

        //  second approach using scanner
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter you note please");
//        int noteObtained = input.nextInt();
//        if (noteObtained >= 90) {
//            System.out.println("you got A+");
//        } else if (noteObtained >= 80) {
//            System.out.println("you got A");
//        } else if (noteObtained >= 70) {
//            System.out.println("you got B+");
//        } else if (noteObtained >= 60) {
//            System.out.println("you got B");
//        } else if (noteObtained >= 50) {
//            System.out.println("you got C");
//        } else if (noteObtained >= 40) {
//            System.out.println("you got D");
//        } else {
//            System.out.println("you are fail");
//        }

        LearnIfElseIf.getGrade();
        System.out.println("************retirement age calculator*************");
        LearnIfElseIf learnifelseif = new LearnIfElseIf();
        learnifelseif.getRetirementCalculationAge();
    }
    // third approach
    // create a method and put all the code inside this method then call this method inside main method

    public static void getGrade(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter you note please");
        int noteObtained = input.nextInt();
        if (noteObtained >= 90) {
            System.out.println("you got A+");
        } else if (noteObtained >= 80) {
            System.out.println("you got A");
        } else if (noteObtained >= 70) {
            System.out.println("you got B+");
        } else if (noteObtained >= 60) {
            System.out.println("you got B");
        } else if (noteObtained >= 50) {
            System.out.println("you got C");
        } else if (noteObtained >= 40) {
            System.out.println("you got D");
        } else {
            System.out.println("you are fail");
        }
    }

    public void getRetirementCalculationAge(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter you age please ");
        int age = in.nextInt();
        if(age<=30 && age<=40){
            System.out.println("your age is more than 30");
        } else if(age>=40 && age <=50){
            System.out.println("your age is more than 40");
        } else if (age >=50 && age <=60){
            System.out.println("your age is more than 50");
        }else if(age>=60 && age<=70){
            System.out.println(" your age is more than 60");
        } else {
            System.out.println("it is your retirement time");
        }
    }
}
