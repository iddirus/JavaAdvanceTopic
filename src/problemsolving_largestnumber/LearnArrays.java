package problemsolving_largestnumber;

import datastucture.collectionframework.array.LearnArray;

import java.util.Arrays;

public class LearnArrays {
    // given ana array {12,25,36,78,14,98,452}
    // print each element individually

    public static void main(String[] args) {
        int[] numbers = new int[]{12, 25, 36, 78,3,98, 452};
        // using for loop to print each element individually

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("**************************************************");
        // print array elements individually
        // call the method first
        LearnArrays.printArrayElementsIndividually();

        System.out.println("************Find out the largest number********************");
        LearnArrays.findOutArrayLargestNumber();

        System.out.println("************Find out the largest number using sort ********************");
        LearnArrays.findOutArrayLargestNumberUsingSort();
        System.out.println("************Find out the Lowest number using sort ********************");
        LearnArrays.findOutArrayLowestNumberUsingSort();
        System.out.println("************Find out the third largest number using sort ********************");
        LearnArrays.findOutArrayThirdLargestNumberUsingSort();

        System.out.println("************Find out the Minimum number using for loop  ********************");

        LearnArrays.minimum(numbers);

    }

    // another approach: create a method

    public static void printArrayElementsIndividually() {
        int[] numbers1 = new int[]{23, 45, 12, 8, 45, 98, 652, 120};
        for (int j = 0; j < numbers1.length; j++) {
            System.out.println(numbers1[j]);
        }
    }

    // given ana array {5,12,45,87,13,52,69,412,236,556}
    // find out the largest number from this array

    public static void findOutArrayLargestNumber() {
        int numbers3[] = new int[]{5, 12, 45, 87, 13, 52, 69, 412, 236, 556};
        int max = 0;
        int size= numbers3.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (numbers3[i] > numbers3[j]) {
                    max = numbers3[i];
                    numbers3[i] = numbers3[j];
                    max = numbers3[j];
                }
            }
        }
        System.out.println("largest number is " + numbers3[size- 1]);

    }


    public static void findOutArrayLargestNumberUsingSort(){
        int numbers3[] = new int[]{5, 12, 45, 87, 13, 52, 69, 412, 236, 556};
        int size = numbers3.length;
        Arrays.sort(numbers3);
        System.out.println("Sorted array : "+Arrays.toString(numbers3));
        int organizedArray= numbers3[size-1];
        System.out.println("largest number is " + organizedArray);
    }


    // find out the lowest number from ana array using sort
    public static void findOutArrayLowestNumberUsingSort(){
        int numbers4[] = new int[]{5, 12, 45, 87, 13, 52, 69, 2,412, 236, 556};
        int size = numbers4.length;
        Arrays.sort(numbers4);
        System.out.println("Sorted array : "+Arrays.toString(numbers4));
        int organizedArray= numbers4[0];
        System.out.println("largest number is " + organizedArray);
    }


    public static void findOutArrayThirdLargestNumberUsingSort(){
        int numbers5[] = new int[]{5, 12, 45, 87, 13, 52, 69, 412, 236, 556};
        int size = numbers5.length;
        Arrays.sort(numbers5);
        System.out.println("Sorted array : "+Arrays.toString(numbers5));
        int organizedArray= numbers5[size-3];
        System.out.println("third largest number is " + organizedArray);
    }

    // find out the minimum number from an array

    public static void minimum(int num[]){
        int min=num[0];
        for (int i = 0; i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("Minimum number is :"+min);
    }






}
