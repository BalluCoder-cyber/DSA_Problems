import java.util.*;
public class FindDuplicate {
    public static void containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        for(int i = 0; i< nums.length-2; i++){
            int val = Math.abs((nums[i] - nums[i+indexDiff]));
            int idx = i-(i+indexDiff);
            System.out.println(idx);
            if(val <= valueDiff && idx<=indexDiff){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        int[] arr= {-2,3};
        containsNearbyAlmostDuplicate(arr,2,5);

    }
}
