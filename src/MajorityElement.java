import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Arrays.sort(nums);

        return nums[n+1];
    }
    public static void main(String[] args) {

        int[] arr = {3,2,3};
        System.out.println(MajorityElement.majorityElement(arr));
    }
}
