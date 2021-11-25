package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Get the input  from the user
        System.out.print("Enter the First Word : ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second Word : ");
        String word2 = scanner.nextLine();
        if (checkAnagram(word1, word2))
            System.out.println(word1 + " and " + word2 + " are Anagrams");
        else
            System.out.println(word1 + " and " + word2 + " are NOT Anagrams");
        scanner.close();
    }

    public static boolean checkAnagram(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        else {
            char[] array1 = word1.toLowerCase().toCharArray();
            char[] array2 = word2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            return (Arrays.equals(array1, array2));
        }
    }
}

