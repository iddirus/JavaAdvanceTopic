package datastucture.collectionframework.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {


    static List <String> stateNameOfUsa= new ArrayList<>();
    static List <String> statesOfAlgeria= new ArrayList<>();
    static List <String> statesOfItaly= new ArrayList<>();

    public static void main(String[] args) {
        // add values // USA
        LearnListHashMap.stateNameOfUsa.add("NY");
        LearnListHashMap.stateNameOfUsa.add("Nj");
        LearnListHashMap.stateNameOfUsa.add("KY");
        LearnListHashMap.stateNameOfUsa.add("CT");
        LearnListHashMap.stateNameOfUsa.add("FL");
        LearnListHashMap.stateNameOfUsa.add("CO");
        System.out.println(LearnListHashMap.stateNameOfUsa);

        // add values // Algeria
        LearnListHashMap.statesOfAlgeria.add("Tizi");
        LearnListHashMap.statesOfAlgeria.add("Oran");
        LearnListHashMap.statesOfAlgeria.add("Alger");
        LearnListHashMap.statesOfAlgeria.add("Bouira");
        LearnListHashMap.statesOfAlgeria.add("Batna");
        System.out.println(LearnListHashMap.statesOfAlgeria);

        // add values // Italy

        LearnListHashMap.statesOfItaly.add("Roma");
        LearnListHashMap.statesOfItaly.add("Juventus");
        LearnListHashMap.statesOfItaly.add("Milan");
        LearnListHashMap.statesOfItaly.add("Bergamo");
        LearnListHashMap.statesOfItaly.add("sassuolo");
        System.out.println(LearnListHashMap.statesOfItaly);

        System.out.println("************Iterate all the value using entry set **********");

        // how to create a map
        Map<String,List< String>> st = new HashMap<>();
        // st.put("key", "value");
        st.put("USA",stateNameOfUsa);
        st.put("Algeria",statesOfAlgeria);
        st.put("Italy",statesOfItaly);
        // iterate all the value
        for (Map.Entry<String,List<String>> entry : st.entrySet()){
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }



    }




}
