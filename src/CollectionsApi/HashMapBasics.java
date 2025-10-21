package CollectionsApi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapBasics {
    public static void main(String[] args) {

        //no order no indexing
        //stores values - K, V
        //key cannot be duplicate
        //can store N number of null values, but only 1 null key
        //hash map is not synchronised/ not thread safe

        HashMap<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("India", "New Delhi");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("UK", "London latest");
        capitalMap.put(null, "Null value");
        capitalMap.put(null, "Null value latest");
        capitalMap.put("France", "Paris");
        capitalMap.put("Austria", null);
        capitalMap.remove("France");

        System.out.println("____________1________________");

        System.out.println(capitalMap.get("UK"));
        System.out.println(capitalMap.get("Germany"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        System.out.println("_____________2_______________");
        //iterator : over the keys by using key set
        Iterator<String> it = capitalMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("_____________3_______________");
        //iterator : over the set(pair) : by using entry set
        Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();

        while (it1.hasNext()) {

            Entry<String, String> entry = it1.next();
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());

        }

        System.out.println("_____________4_______________");
        //iterator : java 8 foreach and lamda:

        capitalMap.forEach((key, value)->System.out.println("key = " + key + " and value = " + value));

    }

}
