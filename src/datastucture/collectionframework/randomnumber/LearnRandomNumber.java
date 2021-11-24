package datastucture.collectionframework.randomnumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {
        // declare a single dimensional array
        double [] priceList = new double[8];
        int [] studentId= new int[6];

        Random random = new Random(20);
        for (int i = 0; i <studentId.length ; i++) {
            studentId[i]= random.nextInt(100);
            System.out.println(studentId[i]);
        }

        // using math.random

        System.out.println(Math.random());





    }


}
