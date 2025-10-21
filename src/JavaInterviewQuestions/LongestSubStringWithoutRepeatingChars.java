package JavaInterviewQuestions;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {
        String input = "amit";
        int ml = LenOfLongSubStr(input);
        System.out.println("Length of Longest substring is = " +ml);

    }

    public static int LenOfLongSubStr(String str) {

        int start = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char curr = str.charAt(end);

            if (map.containsKey(curr)) {
                start = Math.max(start, map.get(curr) + 1);
            }
            map.put(curr, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;

    }
}
