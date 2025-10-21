package CollectionsApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {
    public static void main(String[] args) {
        //1. JavaConcepts.Collections.synchronized list
        List<String> namesList  = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");

        //for add or remove we don't need explicit synchronisation
        //for fetch or traverse we need

        synchronized (namesList) {
            Iterator<String> it = namesList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //2. copyOnWriteArrayList - its a class

        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Naveen");

        //we don't need explicit synchronisation for any type because its thread safe and synchronised

        Iterator<String> it= empList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
