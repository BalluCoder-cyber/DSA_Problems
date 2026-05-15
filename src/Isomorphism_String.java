/*
Given two strings s and t,determine if they are isomorphic.

        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
        All occurrences of a character must be replaced with another character while preserving the order of characters.No two characters may map to the same character,but a character may map to itself.


        Example 1:

        Input:s="egg",t="add"

        Output:true

        Explanation:

        The strings s and t can be made identical by:

        Mapping'e'to'a'.
        Mapping'g'to'd'.
        Example 2:

        Input:s="f11",t="b23"

        Output:false

        Explanation:

        The strings s and t can not be made identical as'1'needs to be mapped to both'2'and'3'.

        Example 3:

        Input:s="paper",t="title"

        Output:true explain it

 */

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphism_String {
    public static boolean isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false; // conflict in mapping
                }
            } else {
                map.put(c1, c2);
            }
        }

        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> see = new HashSet<>();
        int count1 = 0;
        int count2 = 0;

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        for (char c : char1) {
            if (seen.contains(c)) {
                count1++;
            }
            seen.add(c);
        }

        for (char c : char2) {
            if (see.contains(c)) {
                count2++;
            }
            see.add(c);
        }

        if (count1 == count2) {
            return true;
        }
        return false;


        // Second Solution...


//                int[] indexS = new int[200];
//                int[] indexT = new int[200];
//                int len = s.length();
//                if(len != t.length()) {
//                    return false;
//                }
//                for(int i = 0; i < len; i++) {
//                    if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
//                        return false;
//                    }
//                    indexS[s.charAt(i)] = i + 1;
//                    indexT[t.charAt(i)] = i + 1;
//                }
//                return true;
//            }
//        }
    }

    public static void main(String[] args) {

        System.out.println(isomorphic("egg", "add"));

    }
}
