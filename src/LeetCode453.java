public class LeetCode453 {
    public static int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }
        return sum - (min * nums.length);
    }

    public static void main(String[] args) {
        int[] arr = {8, 12, 9, 6};
        System.out.println(minMoves(arr));

    }
}
