package operators;

public class LearnEqualityRelationalOperator {
    // Equality Relational Operator

    // == / Equal to
    // != / not equal
    // > greater than
    // >= greater or equal
    // < less than
    // <= less or equal

    public static void main(String[] args) {

        int age1= 25;
        int age2= 42;
        // how to compare this two ages
        // we will use if block
        // the rules are: if condition is true the if block will be execute
        // if condition is false if block of code will not be execute

        if(age1==age2){
            System.out.println("your age is 25");
        }

        if (age1!=age2){
            System.out.println("your age is 42");
        }

        if (age1>age2){
            System.out.println("your age is 25");
        }

        if (age1<age2){
            System.out.println("your age is greater than 25");
        }

        if (age1<=age2){
            System.out.println("you are great");
        }

        if (age1>=age2){
            System.out.println("you are kid");
        }







    }
}
