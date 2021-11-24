package datastucture.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    // map <K V>
    // key and value

    static String name = "iddir";

    public static void main(String[] args) {
        System.out.println(name);

        // create a map

        Map<String, String> pizzaListMap = new HashMap<>();
        // add value to map " using Put method
        pizzaListMap.put("CH", "Cheese");
        pizzaListMap.put("MUS", "Mushroom");
        pizzaListMap.put("MT", "Meat");
        pizzaListMap.put("CHK", "Chicken");
        pizzaListMap.put("BF", "Beef");

        // print single value
        System.out.println(pizzaListMap.get("MUS"));

        Map<String, Integer> prices = new HashMap<>();
        // add value
        prices.put("CHPrice", 15);
        prices.put("MTPrice", 25);
        prices.put("BFPrice", 30);
        // print one single value
        System.out.println(prices.get("BFPrice"));

        Map<Integer, String> pizzaCode = new HashMap<>();
        // add values
        pizzaCode.put(10, "Cheese");
        pizzaCode.put(6, "Mushroom");
        pizzaCode.put(2, "Chicken");
        // print single value
        System.out.println(pizzaCode.get(10));

        System.out.println("*********** print all the value using for each loop ************");

        // how to print all the value
        for (String str : pizzaListMap.keySet()) {
            System.out.println(pizzaListMap.get(str));
        }

        System.out.println("***********  for each loop for pizzaCode map  ************");
        for (Integer in : pizzaCode.keySet()){
            System.out.println(pizzaCode.get(in));
        }

        System.out.println("****************use entrySet to retrieve all the values**************");
        for (Map.Entry<String,String > pll : pizzaListMap.entrySet()){
            System.out.println(pll.getKey()+ " : " + pll.getValue());
        }


    }


}
