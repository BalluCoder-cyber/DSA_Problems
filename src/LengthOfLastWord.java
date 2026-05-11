/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

import java.util.Scanner;

public class LengthOfLastWord {
    static int lengthOfLastWord(String s) {
        int count=0;
        s = s.trim();
        int len = s.length()-1;
        for(int i=len; i>=0;i--){
            if(s.charAt(i) == ' ')
                break;

            if(s.charAt(i) != ' ')
                count++;

        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence...");
        String s = sc.nextLine();
        System.out.println("Your last word length : "+lengthOfLastWord(s));

    }
}
