package CollectionsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,2,4,5,8));

        // 1) using LinkedHashSet on any kind of data

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer> numbersWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
        System.out.println(numbersWithoutDuplicates);


        //2 ) using java streams

        ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,2,4,5,8,11,34,44,55,34,11,1,2,1));
        List<Integer> markListUnique = markList.stream().distinct().collect(Collectors.toList());
        System.out.println(markListUnique);







    }
}
