package CollectionsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HowToCompareArrayList {
    public static void main(String[] args) {

        //1.sort and then equals :
        ArrayList<String> listOne = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> listTwo = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> listThree = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        Collections.sort(listOne);
        Collections.sort(listTwo);
        Collections.sort(listThree);
        System.out.println(listOne.equals(listTwo));//false
        System.out.println(listOne.equals(listThree));//true

        //2. compare two list - find out additional elements
        ArrayList<String> listFour = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> listFive = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

        listFour.removeAll(listFive);
        System.out.println(listFour);

        //3. find out missing elements

        listFive.removeAll(listFour);
        System.out.println(listFive);

        //4.common elements

        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","ruby","C#","JS"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","ruby","C#","PHP"));

        lang1.retainAll(lang2);
        System.out.println(lang1);








    }
}
