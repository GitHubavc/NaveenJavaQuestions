package CollectionsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(100);
        ar.add(200);
        ar.add("testing");
        ar.add('A');
        ar.add(12.44);
        ar.add(false);

        ArrayList<Object> ar2 = new ArrayList<Object>();
        ar2.add(222);
        ar2.add(333);
        ar2.add("Learning");
        ar2.add('V');
        ar2.add(33.55);
        ar2.add(true);


//        System.out.println(ar);
//        System.out.println(ar.get(2));
//        System.out.println(ar.size());
//
//        System.out.println("after adding array2");
//        ar.addAll(ar2);
//        System.out.println(ar);
//
//        ar.addAll(2,ar2);
//        System.out.println(ar);
//
//        ar.clear();
//        System.out.println(ar);

      ArrayList<Object> cloneList =(ArrayList<Object>)ar.clone();
        System.out.println(cloneList);

        System.out.println(ar.contains("testing"));

        System.out.println(ar.indexOf("testing"));

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Tom","Amit","Anu","Amit","Ted"));
        System.out.println(list1);

        int i = list1.lastIndexOf("Amit");
        System.out.println(i);

        System.out.println(list1.removeFirst());

        list1.remove("Amit");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(s-> s%2 == 0);
        System.out.println(list2);

        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Steve","Lisa","Amit","Tom"));
        System.out.println(namesList);
        namesList.retainAll(Collections.singleton("Tom"));
        System.out.println(namesList);

        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        ArrayList<Integer> subList = new ArrayList<>(numbers1.subList(2,6));
        System.out.println(subList);

        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Lisa","Tom","Steve","Lisa","Amit","Tom","Robert"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for (Object o : arr) {
            System.out.println(o);
        }










    }
}
