public class Search_Insert_Position {
    static int position(int[] nums , int target) {
        int l = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return i;
            if (target < nums[i]) return i - 1;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println( position(nums, 3));
    }
}
