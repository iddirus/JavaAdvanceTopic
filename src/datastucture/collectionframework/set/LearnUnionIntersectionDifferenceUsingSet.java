package datastucture.collectionframework.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifferenceUsingSet {

    public static void main(String[] args) {
        // declare single dimensional array
        int[] number1 = {14, 25, 4, 71, 66, 32, 42, 10, 11, 43};
        int[] number2 = {13, 35, 7, 76, 96, 25, 102, 17, 4, 423};

        // how to merge / do union set between this two arrays

        // first array
        Set<Integer> num1 = new HashSet<>();
        num1.addAll(Arrays.asList(new Integer[]{14, 25, 4, 71, 66, 32, 42, 10, 11, 43}));

        // second array
        Set<Integer> num2 = new HashSet<>();
        num2.addAll(Arrays.asList(new Integer[]{13, 35, 7, 76, 96, 25, 102, 17, 4, 423}));

        // to do union set
        // it will print one Array without the duplicated values
        Set<Integer> union = new HashSet(num1);
        union.addAll(num2);
        System.out.println("Union of two arrays : " + union);

        System.out.println("********* After intersection**********************");

        // to do intersection between two set of arrays
        // it will print only the duplicated values / the common values
        Set<Integer> intersection = new HashSet(num1);
        intersection.retainAll(num2);
        System.out.println("intersection of two arrays : " + intersection);

        System.out.println("********* After symmetric **********************");

        // to do symmetric difference
        Set<Integer> difference = new HashSet(num1);
        difference.removeAll(num2);
        System.out.println("difference of two arrays : " + difference);


    }


}
