public class FindPeakElement {
    public static int findPeakElement(int[] nums) {

        int max = nums[0];
        int maxIdx =0;
        for(int i = 1; i<nums.length; i++){
           if(nums[i]>max){
               max = nums[i];
               maxIdx = i;
           }
        }
        return maxIdx;
    }
    public static void main(String[] args) {
        int[]arr = {-1,-2,-3};
        System.out.println(findPeakElement(arr));

    }
}
