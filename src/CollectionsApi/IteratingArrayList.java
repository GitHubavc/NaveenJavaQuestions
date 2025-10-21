package CollectionsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String >();
        studentList.add("Tom");
        studentList.add("Naveen");
        studentList.add("Amit");
        studentList.add("Anu");

        System.out.println( "********Using for loop********");

        for(int i= 0; i<studentList.size(); i++){
            System.out.println(studentList.get(i));

        }

        System.out.println( "********Using for each********");

        for ( String stuList: studentList) {
            System.out.println(stuList);
        }

        System.out.println( "********Using lamda********");

        studentList.stream().forEach(e-> System.out.println(e));

        System.out.println( "********Using iterator********");

        Iterator<String> it = studentList.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //list with other collection

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(numbers);


    }
}
