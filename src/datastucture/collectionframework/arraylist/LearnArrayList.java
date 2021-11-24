package datastucture.collectionframework.arraylist;

import java.util.ArrayList;

public class LearnArrayList {
    // ArrayList : Dynamic array: no need to declare the size

    // declare ArrayList in global level: non static
    ArrayList<String> usStates = new ArrayList<>();

    // declare ArrayList in global level:  static
    static ArrayList<String> foodName= new ArrayList<>();

    public static void main(String[] args) {

        // how to add value in this ArrayList: we have a non static array list : we have to create an object
        // then call by object name

        LearnArrayList learnArrayList = new LearnArrayList();
        learnArrayList.usStates.add("NY");
        learnArrayList.usStates.add("NJ");
        learnArrayList.usStates.add("CT");
        learnArrayList.usStates.add("CA");
        learnArrayList.usStates.add("VA");
        learnArrayList.usStates.add("MA");

        // how to print single value from ArrayList
        System.out.println("State Name is : " +learnArrayList.usStates.get(1));
        System.out.println("State Name is : " +learnArrayList.usStates.get(5));
        // declare array list inside main method
        ArrayList<String> carInfo= new ArrayList<>();
        // add value to this array list
        carInfo.add("BMW");
        carInfo.add("Mercedes");
        carInfo.add("Audi");
        carInfo.add("Volkswagen");
        // call single value
        System.out.println("*************** Car info ************************");
        System.out.println(carInfo.get(1));
        System.out.println(carInfo.get(3));

        // add value to a static array list
        LearnArrayList.foodName.add("Potatoes");
        LearnArrayList.foodName.add("Tomatoes");
        LearnArrayList.foodName.add("Salads");
        LearnArrayList.foodName.add("Onions");
        // call a single value
        System.out.println("*************** Food Name  ************************");
        System.out.println(LearnArrayList.foodName.get(0));
        System.out.println(LearnArrayList.foodName.get(2));

        // we can not use int in array list unless to replace it by Integer: Wrapper class
        // Wrapper class
        ArrayList<Integer> teamRanking= new ArrayList<Integer>();
        teamRanking.add(1);
        teamRanking.add(2);
        teamRanking.add(3);
        teamRanking.add(4);
        teamRanking.add(5);
        teamRanking.add(6);

        System.out.println("team ranking is :"+teamRanking.get(0));
        System.out.println("team ranking is :"+teamRanking.get(2));
        System.out.println("team ranking is :"+teamRanking.get(5));

        // how to retrieve all the value from array list using for each loop
        System.out.println("*********how to retrieve all the value from array list using for each loop ******** ");
        for (Integer team : teamRanking){
            System.out.println("team ranking is : "+team);
        }

        System.out.println("******************food name ***************");
        for(String str : foodName){
            System.out.println("food name is : "+str);
        }

        System.out.println("************car info**********************");
        for(String st : carInfo){
            System.out.println("car info is : "+st);
        }

        System.out.println("************ after remove car info**********************");
        carInfo.remove(2);
        for(String st : carInfo){
            System.out.println("car info is : "+st);
        }





    }


}
