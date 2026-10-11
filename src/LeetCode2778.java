public class LeetCode2778 {
    public static int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<=n; i++){
            if(n%(i+1)==0){
                sum += nums[i]*nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums ={4,66,7,8,9,22};
        System.out.println(sumOfSquares(nums));
    }
}
