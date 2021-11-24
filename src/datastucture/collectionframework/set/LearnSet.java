package datastucture.collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set : Interface which extends collection: it is an un-order collection of objects
    // in which duplicated values can not be stored

    public static void main(String[] args) {
        Set<String> phoneModels= new HashSet<>();
        // add values
        phoneModels.add("Iphone 4");
        phoneModels.add("Iphone 5S");
        phoneModels.add("Iphone 7S ");
        phoneModels.add("Iphone 11 pro ");
        phoneModels.add("Iphone 12 pro max ");
        phoneModels.add("Iphone 13 ");

        System.out.println(phoneModels);
        for (String st : phoneModels){
            System.out.println("Phone models are : "+st);
        }
        System.out.println("****** After remove ************");
        phoneModels.remove("Iphone 4");
        for (String st : phoneModels){
            System.out.println("Phone models are : "+st);
        }

    }


}
