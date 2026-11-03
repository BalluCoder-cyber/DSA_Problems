import java.util.Arrays;

public class LeetCode3736 {
    public int minMoves(int[] nums) {
        int moves =0;
        // Arrays.sort(nums);
        int max = Arrays.stream(nums).max().getAsInt();
        // int last = nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            moves += Math.abs(max-nums[i]);
        }
        return moves;

    }
    public static void main(String[] args) {
        LeetCode3736 lc = new LeetCode3736();
        int[] arr = {1,2,4};
        System.out.println(lc.minMoves(arr));
    }
}
