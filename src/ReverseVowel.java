import java.util.Arrays;

public class ReverseVowel {
    public static String reverseVowels(String s) {
//        StringBuilder result = new StringBuilder();
//        char[] crr = s.toCharArray();
//        String vowel = "";
//        int idx =0;
//        for (int i = 0; i < crr.length; i++) {
//            if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u' || crr[i] == 'A' || crr[i] == 'E' || crr[i] == 'I' || crr[i] == 'O' || crr[i] == 'U'){
//                vowel += crr[i];
//            }
//        }
//        for (int i = crr.length-1; i >=0; i--) {
//            if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u' || crr[i] == 'A' || crr[i] == 'E' || crr[i] == 'I' || crr[i] == 'O' || crr[i] == 'U'){
//               crr[i] = vowel.charAt(idx);
//               idx++;
//            }
//        }
//        result.append(crr);
//
//        return result.toString();

        if (s == null || s.isEmpty()) return s;


        char[] crr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0, right = crr.length - 1;

        while (left < right) {

            while (left < right && vowels.indexOf(crr[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(crr[right]) == -1) {
                right--;
            }

            char temp = crr[left];
            crr[left] = crr[right];
            crr[right] = temp;

            left++;
            right--;
        }

        return new String(crr);
    }

    public static void main(String[] args) {
        String vow = "hAwlloo ";
        System.out.println(reverseVowels(vow));
    }
}
