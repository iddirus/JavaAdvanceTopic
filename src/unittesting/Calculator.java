package unittesting;



public class Calculator {

    public static int doMulti(int number1,int number2) {
        int output = number1 * number2;
        // System.out.println("output is " + total);
        return output;
    }

    // automation approach
    public static int doSum(int number1, int number2) {
        int total = number1 + number2;
        // System.out.println(total);
        return total;
    }

    public static String StFullName(String firstName,String lastname){
        String fullName=firstName + " " + lastname;
        return fullName;
    }

    public static boolean Pizza(){
        boolean IsPizzaAvailable=true;
        return IsPizzaAvailable;
    }

    // alternative of main method
//    @Test
//    public void testDoSum() {
//        int expectedValue = 163;
//        int actualValue = Calculator.doSum(113, 50);
//        Assert.assertEquals("test Fail if Not Match",expectedValue,actualValue);
//
//    }


    // create main method
//    public static void main(String[] args) {
//        Calculator.doMulti();
//        System.out.println("****************Do sum method ***************");
//        // Calculator.doSum(); // it will print nothing
//        // if we do: // System.out.println(total); in here it will print the total value of this two numbers
//
//        // reel testing approach
//        int expectedValue = 163;
//        int actualValue = Calculator.doSum(113,50);
//        if (expectedValue == actualValue) {
//            System.out.println("test passe ");
//        } else {
//            System.out.println("test fail");
//        }
//
//    }


}
