import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static String searchRange(int[] nums, int target) {
        int first = -1, last = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                if (first == -1) {
//                    first = i;
//                }
//                last = i;
//            }
//        }
        int i = 0;
        int j = nums.length-1;
        while (i<=j){
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
            i++;
        }
        return Arrays.toString(new int[]{first, last}) ;

    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,3,4,10};
        System.out.println(searchRange(nums,7));

    }
}