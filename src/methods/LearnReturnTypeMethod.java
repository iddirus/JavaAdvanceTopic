package methods;

public class LearnReturnTypeMethod {

    // return type without parameter
    // return type with parameter

    // return means: data type  class
    // syntax: access modifier data type methodName

    // return type without parameter
    public static int getAge(){
        int age = 41;
        System.out.println("my age is "+age);
        return age;
    }
    public String getName(){
        String name="Iddir";
        System.out.println("my name is "+name);
        return name;
    }

    public static int doDivision(){
        int number1=120;
        int number2=10;
        int div = number1/number2;
        System.out.println("Division of two numbers is "+div);
        return div;
    }

    // return type with parameter

    public static int getWeeklySalary(int perHourSalary, int weeklyHours){
        int weeklySalary= perHourSalary*weeklyHours;
        System.out.println("weekly salary is "+weeklySalary);
        return weeklySalary;
    }

    public static int doMultiplication(int num1, int num2){
        int num3=num1*num2;
        System.out.println("multiplication is "+num3);
        return num3;

    }
    public int doSum(int num1, int num2){
        int num3=num1+num2;
        System.out.println("summation is "+num3);
        return num3;

    }
    public  int doDiv(int num1, int num2){
        int num3=num1/num2;
        System.out.println("Division is "+num3);
        return num3;

    }

    public static double getRemainder(double number1,double number2){
        double remainder=number1%number2;
        System.out.println("the remainder is "+remainder);
        return remainder;
    }




    public static void main(String[] args) {
        LearnReturnTypeMethod.getAge();
        LearnReturnTypeMethod learnreturntypemethod = new LearnReturnTypeMethod();
        learnreturntypemethod.getName();
        LearnReturnTypeMethod.doDivision();
        System.out.println("************return type method with parameter**********************");
        LearnReturnTypeMethod.getWeeklySalary(45,40);
        LearnReturnTypeMethod.doMultiplication(12,45);
        learnreturntypemethod.doSum(29,48);
        learnreturntypemethod.doDiv(78,12);
        LearnReturnTypeMethod.getRemainder(28.45,17.1);


    }




}
