package StreamsApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxLengthOfStringUsingStreams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence to find the word with max length :  ");
        String  str = sc.nextLine();
        System.out.println("The largest word here is : "+maxLengthWordInSentenceUsingStreams(str));

    }

    public static String maxLengthWordInSentenceUsingStreams(String str) {
        String ans =Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        return ans;
    }
}
