import java.util.*;
public class LeetCode1291 {
    public static void sequentialDigits(int low, int high) {
        List<Integer> arr = new ArrayList<>();
        String diff="";
        String val = "";
        int range = low;
        String l = String.valueOf(low);
        for(int i = 1; i<=l.length(); i++){
              diff += 1;
              val += i;
        }
        int val1 = Integer.parseInt(val);
        int diff1 = Integer.parseInt(diff);
        while (range < high){
            arr.add(val1);
            val1 = diff1+val1;
            range = val1;
            String val2 = String.valueOf(val1);
            if(val2.charAt(0) == '7'){
                diff1 += 10000;
                val1 = Integer.parseInt(val)+diff1;
            }

        }

        System.out.println(arr);
    }
    public static void main(String[] args) {
        sequentialDigits(1000,13000);
    }
}
