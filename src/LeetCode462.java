import java.util.Arrays;

public class LeetCode462 {
    public int minMoves2(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int median = nums.length/2;
        for (int i : nums) {
            moves += Math.abs(nums[median] - i);
        }
        return moves;
    }
    public static void main(String[] args) {
        int[] arr = {1,10,2,9};
        LeetCode462 lc = new LeetCode462();
        System.out.println(lc.minMoves2(arr));
    }
}
