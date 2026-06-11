import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {

        String[] newArr = new String[nums.length];
        for(int i = 0; i< nums.length; i++){
            newArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(newArr, (a, b) -> (b + a).compareTo(a + b));

        if (newArr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : newArr) {
            sb.append(s);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        System.out.println(largestNumber(arr));
    }
}
