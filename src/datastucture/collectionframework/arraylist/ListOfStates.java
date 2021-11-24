package datastucture.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfStates {

    // static ArrayList<String> algStates= new ArrayList<>();

    public static void main(String[] args) {
        List<String> algStates= new ArrayList<>();
        // add value to this ArrayList

        algStates.add("Tizi_Ouzou");
        algStates.add("Alger");
        algStates.add("Bouira");
        algStates.add("Bejaia");
        algStates.add("Blida");
        algStates.add("Tipaza");
        algStates.add("Boumerdes");
        algStates.add("Setif");
        algStates.add("Batna");
        algStates.add("Mostaganem");

        // print single value

        System.out.println(algStates.get(0));
        System.out.println(algStates.get(2));
        System.out.println(algStates.get(5));

        // print all the value using for each loop
        System.out.println(" ************* print all the value using for each loop *********");
        for (String alg : algStates){
            System.out.println("States of algeria are : "+alg);
        }

        // print all the value after remove  using for each loop
        System.out.println(" ************* print all the value after remove using for each loop *********");
        algStates.remove(6);
        algStates.remove("Batna");
        for (String alg : algStates){
            System.out.println("States of algeria are : "+alg);
        }

        // using Iterator to print all the value after remove  using for each loop
        System.out.println("*****using Iterator to print all the value after remove  using for each loop******");
        Iterator it = algStates.iterator();
        while (it.hasNext()){
            System.out.println("stats after remove are : "+it.next());
        }



    }





}
