import java.util.Arrays;

public class LeetCode3689 {
    public static long maxTotalValue(int[] nums, int k) {

        int idx = 0;
        long sum = 0;
        int idxL = 1;
        int idxR = nums.length-2;
        int mid = nums.length/2;

        while (idx < k) {
            long max = Integer.MIN_VALUE;
            long min = Integer.MAX_VALUE;

            for (int i = idx; i < nums.length; i++) {

                if (max < nums[i]) {
                    max = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            sum += (max-min);
            idx++;

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(maxTotalValue(arr, 2));
    }
}
