import java.util.Arrays;

public class SumDifference {
    public static void leftRightDifference(int[] nums) {

        int[] result = new int[nums.length];
        int[] lftArr = new int[nums.length];
        int[] rgtArr = new int[nums.length];
        int lIdx = 0;
        int rIdx = nums.length-1;
        int sumR = 0;
        int sumL = 0;

        while (lIdx < nums.length){
            lftArr[lIdx] = sumL;
            sumL = sumL+nums[lIdx];
            lIdx++;

            rgtArr[rIdx] = sumR;
            sumR = sumR+nums[rIdx];
            rIdx--;
        }

        for (int i=0; i<nums.length; i++){
            result[i] = Math.abs(rgtArr[i]-lftArr[i]) ;
        }

        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr = {1};
        leftRightDifference(arr);


    }
}
