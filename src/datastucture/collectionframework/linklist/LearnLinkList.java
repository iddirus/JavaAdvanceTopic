package datastucture.collectionframework.linklist;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkList {

    public static void main(String[] args) {
        getMobilePhoneList();
        for (String st : mobilePhoneList){
            System.out.println(st);
        }
        System.out.println(mobilePhoneList.get(0));

        System.out.println("****************************************");
        getPizzaList();
        for (String ste : pizzaList){
            System.out.println("pizza list is : "+ste);
        }
        System.out.println("*********************************************");
        getFruitsList();
        for (String art : fruitsList){
            System.out.println("fruits list is : "+art);
        }
    }

    // LinkList is dynamic like arraylist
    // LinkList is used for manipulation fo data
    // is faster than ArrayList because it uses doubly link list

    public static List<String> mobilePhoneList = new LinkedList<>();
    public static List<String> pizzaList = new LinkedList<>();
    public static List<String> fruitsList = new LinkedList<>();

    // create three methods of these three lists
    public static void getMobilePhoneList() {
        LearnLinkList.mobilePhoneList.add("Iphone");
        LearnLinkList.mobilePhoneList.add("Samsung");
        LearnLinkList.mobilePhoneList.add("Lg");
        LearnLinkList.mobilePhoneList.add("Motorola");
        LearnLinkList.mobilePhoneList.add("Sony");
        System.out.println(mobilePhoneList);
    }

    public static void getPizzaList() {
        LearnLinkList.pizzaList.add("Cheese");
        LearnLinkList.pizzaList.add("Mushroom");
        LearnLinkList.pizzaList.add("Chicken");
        LearnLinkList.pizzaList.add("Jalapeno");
        LearnLinkList.pizzaList.add("Meat");
        LearnLinkList.pizzaList.add("Tuna");
        System.out.println(pizzaList);
    }

    public static void getFruitsList() {
        LearnLinkList.fruitsList.add("Banana");
        LearnLinkList.fruitsList.add("Mango");
        LearnLinkList.fruitsList.add("Kiwi");
        LearnLinkList.fruitsList.add("Orange");
        LearnLinkList.fruitsList.add("Melon");
        LearnLinkList.fruitsList.add("Apple");
        System.out.println(fruitsList);
    }




}
