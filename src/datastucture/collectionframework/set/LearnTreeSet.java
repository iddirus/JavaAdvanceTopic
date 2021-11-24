package datastucture.collectionframework.set;

import java.util.TreeSet;

public class LearnTreeSet {
    // TreeSet :

    public static void main(String[] args) {
        TreeSet<String> phoneBrand = new TreeSet<>();
        // add values
        phoneBrand.add("Samsung");
        phoneBrand.add("Iphone");
        phoneBrand.add("Nokia ");
        phoneBrand.add("Blackberry ");
        phoneBrand.add("Apple");
        phoneBrand.add("Sony");

        System.out.println(phoneBrand);
        for (String st : phoneBrand){
            System.out.println("Phone models are : "+st);
        }
        System.out.println("****** After remove ************");
        phoneBrand.remove("Blackberry");
        System.out.println(phoneBrand);

        System.out.println("************** poll first method**********");
        // poll first : first value will be removed then it will print the next value
        phoneBrand.pollFirst();
        System.out.println(" first value removed is : "+phoneBrand.pollFirst());

        // poll last : last value will be removed then it will print the one before the last
        phoneBrand.pollLast();
        System.out.println(" last value removed is : "+phoneBrand.pollLast());


    }


}
