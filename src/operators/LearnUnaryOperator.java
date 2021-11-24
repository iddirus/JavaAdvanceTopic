package operators;

public class LearnUnaryOperator {

    // ++ increment operator: 0,1,2,3,4,5,
    // pre increment ++number: before
    // post increment number++: After
    // -- decrement operator: 5,4,3,2,1
    // pre decrement --number: before
    // post decrement number--: After


    public static void main(String[] args) {
        int number= 23; // declare a variable and assign value

        // use pre Increment operator: ++ number
        ++ number;
        ++ number;
        // use post Increment operator: number ++
        number++;
        number++;
        number++;
        number++;
        number++;
        number++;
        System.out.println("the value of number "+number);
        System.out.println("****************************");

        // use pre decrement operator: -- number
        int num1=56;

        --num1;
        --num1;
        --num1;
        --num1;

        System.out.println("the value is "+num1);

        // use post decrement operator: -- number
        int num2=45;
        num2--;
        num2--;
        num2--;
        num2--;
        System.out.println("value is "+num2);

        // use both operator: -- number
        int num3=-79;
        System.out.println("************************");
        ++num3;
        ++num3;
        ++num3;
        --num3;
        --num3;
        num3++;
        num3--;
        num3--;
        num3--;
        num3++;
        num3++;
        num3++;
        System.out.println("total "+num3);





    }




}
