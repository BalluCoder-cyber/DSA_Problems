import java.util.Arrays;

public class LeetCode3727 {
    public static void maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int[] newArr = new int[n];
        int largeVal = n - 1;
        int smallVal = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                newArr[i] = nums[largeVal--];
            } else {
                newArr[i] = nums[smallVal++];
            }
        }
        System.out.println(Arrays.toString(newArr));
        long sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i % 2 == 0) {
                sum +=(long) newArr[i] * newArr[i];
            } else {
                sum -=(long) newArr[i] * newArr[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] ags) {
        int[] arr = {1, -1, 2, -2, 3, -3};
        maxAlternatingSum(arr);
    }
}
