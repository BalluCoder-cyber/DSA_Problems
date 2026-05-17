/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:
        Input: s = "rat", t = "car"
        Output: false

 */
import java.util.Arrays;

public class AnalogString {
    static boolean analog(String s, String t){
        if(s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr,tArr);
    }
    public static void main(String[] args) {
        System.out.println(analog("rat","cat"));

    }
}
