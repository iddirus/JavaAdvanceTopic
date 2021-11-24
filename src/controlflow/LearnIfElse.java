package controlflow;

import java.util.Scanner;

public class LearnIfElse {

    // if condition is true it will execute if block of code
    // if condition is false it will not execute if block of code then it will execute else block


    public static void main(String[] args) {
        String name="ronaldo";
        int age = 41;
        int num1=15;
        int num2= 20;
        if (name=="Iddir"){
            System.out.println("you are a male ");
        } else{
            System.out.println("you are not a male");
        }
        System.out.println("******************************");

        if (age!=47){
            System.out.println("your age is 41");
        } else {
            System.out.println("you are an adult");
        }
        System.out.println("*******************************");

        if (age!=47 && name!="Iddir"){
            System.out.println("your are good ");
        } else {
            System.out.println("you are an adult");
        }

        if (num1<num2 || age==45 ){
            System.out.println("hello man ");
        } else {
            System.out.println("bonjour tout le monde");
        }
        System.out.println("******************************");

        if (num1>num2 || age==41 && name!="ronaldo" ){
            System.out.println("hello man ");
        } else {
            System.out.println("bonjour tout le monde");
        }

        System.out.println("******************************");

        Scanner input = new Scanner(System.in);
        System.out.println("please enter you age");
        int voterAge= input.nextInt();
        if (voterAge>18){
            System.out.println("you are eligible for vote");

        }else {
            System.out.println("you are not eligible for vote");
        }




    }


}
