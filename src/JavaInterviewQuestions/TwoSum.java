package JavaInterviewQuestions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,13};
        int tar = 15;
        int[] result = findTwoSum(arr,tar);
        System.out.println("The indices of 2 numbers that add up the target " +tar+ " for array " + Arrays.toString(arr) + " are = " + Arrays.toString(result));


    }

    public static int[] findTwoSum (int[] num, int target) {
        int [] arr = new int[2];
        for (int i= 0; i<num.length;i++) {
            for (int j = i+1;j<num.length;j++) {
                if (num[i] +num[j] == target) {
                    arr[0]= i;
                    arr[1]= j;
                    break;
                }
            }
        }
        return arr;

    }
}
