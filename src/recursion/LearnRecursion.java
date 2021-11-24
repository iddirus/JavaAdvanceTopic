package recursion;

public class LearnRecursion {

    // Recursion in java: is a basic programming technique you can use in Java
    // in which a method calls itself to solve some problem

    static int result = 10;

    public static void getSuccess() {

        // by using if condition we can control this recursion
        // using past decrement
        result--;
        if (result >0) {
            System.out.println("this is get success method  ");
            System.out.println("this is recursion  ");
            System.out.println("hello there  ");
            System.out.println("this is get fail method  ");
            getSuccess();
        }
        // using past increment
//        result++;
//        if (result <10) {
//            System.out.println("this is get success method  ");
//            System.out.println("this is 1  ");
//            System.out.println("hello there  ");
//            System.out.println("this is get fail method  ");
//            getSuccess();
//        }
    }

    public static void main(String[] args) {
        LearnRecursion.getSuccess();


    }
}
