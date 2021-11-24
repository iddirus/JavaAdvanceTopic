package datastucture.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers {
    // Find out the frequency of the number in a  given array
    // int [] numbers={23,45,67,78,48,78,99,222,444,333,100,11,33,76,67,45};

    public static void main(String[] args) {
        int [] numbers={23,45,67,78,48,78,99,222,444,333,100,11,33,76,67,45};
        // create HashMap

        HashMap<Integer,Integer> hmap=new HashMap<>();
        // To add value in map
        for (int i=0; i<numbers.length;i++){
            Integer count= hmap.get(numbers[i]);
            if (hmap.get(numbers[i]) == null){
                hmap.put(numbers[i],1);
            } else {
                hmap.put(numbers[i], ++count);
            }
        }
        // To iterate the map
        for (Map.Entry mp: hmap.entrySet()){
            System.out.println("Frequency of "+mp.getKey()+" : "+mp.getValue());
        }

    }


}
