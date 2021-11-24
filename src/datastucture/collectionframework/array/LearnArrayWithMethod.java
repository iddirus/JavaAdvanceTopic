package datastucture.collectionframework.array;

import java.util.Arrays;

public class LearnArrayWithMethod {

    public static void main(String[] args) {
        LearnArrayWithMethod.getStudentsName();
        // System.out.println(LearnArrayWithMethod.getStudentsName());
        // String newNames[]=LearnArrayWithMethod.getStudentsName();
        // System.out.println(Arrays.toString(newNames));
        System.out.println(Arrays.toString(LearnArrayWithMethod.getStudentsName()));
        // Arrays.toString(LearnArrayWithMethod.getNumbers());

        System.out.println(Arrays.toString(LearnArrayWithMethod.getNumbers()));

        // how to print each value one after one on the next line using for loop
        int newNumbers[]= LearnArrayWithMethod.getNumbers();
        System.out.println("****************print each number individually using for loop*************");
        for (int i=0; i <newNumbers.length;i++){
            System.out.println(newNumbers[i]);
        }


    }

    public static String[] getStudentsName(){
        String names[]= new String[]{"Robert","Michael","Donald","Joe"};
        return names;
    }
    public static int [] getNumbers(){
            int numbers[]= new int[]{45,25,12,74,5,23,12,50};
            return numbers;
    }

    // given ana array {12,24,36,48,98}
    // print each element individually


}
