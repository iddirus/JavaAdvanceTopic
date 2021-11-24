package datastucture.collectionframework.linklist;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkListMethods {


    public static void main(String[] args) {
        List<String> mobilePhonesList = new LinkedList<>();
        // add values
        mobilePhonesList.add("Iphone");
        mobilePhonesList.add("Samsung");
        mobilePhonesList.add("Lg");
        mobilePhonesList.add("Motorola");
        mobilePhonesList.add("Sony");
        System.out.println(mobilePhonesList);
        // add one more value with index
        System.out.println("********* add value *************");
        mobilePhonesList.add(2,"Google Pixel");
        System.out.println(mobilePhonesList);
        // replace value by another one
        System.out.println("************* replace value by another value*******************");
        mobilePhonesList.set(4,"Sony Ericsson");
        System.out.println(mobilePhonesList);
        // print all the value using for loop
        System.out.println("length is : " +mobilePhonesList.size());
        System.out.println("**************print all the value using for loop **************");
        for (int i = 0; i<mobilePhonesList.size();i++){
            System.out.println(mobilePhonesList.get(i));
        }
        System.out.println("************** contains method **************");
        mobilePhonesList.contains("Lenovo");
        System.out.println(mobilePhonesList.contains("Lenovo"));

        mobilePhonesList.contains("Samsung");
        System.out.println(mobilePhonesList.contains("Samsung"));


    }


}
