public class Triangular_Sum {
    public static int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int n = nums.length-1;
        int [] newArr = new int[n];
        for(int i = 0; i<n; i++){

            newArr[i] = (nums[i]+nums[i+1])%10;
            n = n--;

        }
        return triangularSum(newArr);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(triangularSum(arr));
    }
}
