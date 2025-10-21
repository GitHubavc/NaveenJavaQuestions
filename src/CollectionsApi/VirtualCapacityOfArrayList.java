package CollectionsApi;

import java.util.ArrayList;

public class VirtualCapacityOfArrayList {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>();
        System.out.println(ar.size());
        //Physical capacity of Arraylist = 0
        //virtual capacity = 10
        ar.add(200);
        ar.add(300);
        ar.add(400);
        ar.add(500);
        System.out.println(ar.size());
    }
}
