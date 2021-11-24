package operators;

public class LearnConditionalOperator {

    // && AND operator: All the conditions must have to be true then it will execute if block of code
    // || OR operator: one condition must have to be true then it will execute if block of code

    public static void main(String[] args) {
        int num1=45;
        int num2= 25;
        int num3= 78;

        if (num1==num2 && num2<num3){
            System.out.println("hello conditional operator");

        }
        if (num1!=num2 && num2<num3){
            System.out.println("waw");
        }

        if (num1==num2 || num2<num3){
            System.out.println("hello pipe operator");
        }


    }
}
