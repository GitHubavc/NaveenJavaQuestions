package CollectionsApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMapToArrayList {
    public static void main(String[] args) {
        HashMap<String,Integer> compMap = new HashMap<String,Integer>();
        compMap.put("Google",10000);
        compMap.put("Walmart",20000);
        compMap.put("Amazon",30000);
        compMap.put("Facebook",40000);
        compMap.put("Cisco",50000);

        System.out.println("comp map size : " +compMap.size());
        Iterator it = compMap.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //convert hashmap keys to arraylist
        List<String> compNamesList = new ArrayList<String>(compMap.keySet());
        for (String t : compNamesList) {
            System.out.println(t);
        }

        //convert hashmap values to arraylist
        List<Integer> compValuesList = new ArrayList<Integer>(compMap.values());
        System.out.println(compValuesList);
        for (Integer i: compValuesList) {
            System.out.print(i+ " ");
        }



    }
}
