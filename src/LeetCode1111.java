import java.util.Arrays;

public class LeetCode1111 {
    public static String maxDepthAfterSplit(String seq) {
        char[] arr = seq.toCharArray();
        int[] ans = new int[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] =='('){
                count++;
                ans[i] = count%2;
            }else{
                ans[i] = count%2;
                count--;
            }
        }
        return Arrays.toString(ans);
    }
    public static void main(String[] args) {
        String seq = "(()())";
        System.out.println(maxDepthAfterSplit(seq));
    }
}
