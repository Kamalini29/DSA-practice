package Intense_DSA;

import java.util.HashMap;

public class LongestSubString {
    public int findLong(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for(int r=0; r<str.length();r++){
            char c = str.charAt(r);
            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) +1;
            }
            map.put(c,r);
            maxLen = Math.max(maxLen, r - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args){
        LongestSubString s = new LongestSubString();
        String str = "Kamaalsiniii";

        int n = s.findLong(str);
        System.out.println(n);
    }
}
