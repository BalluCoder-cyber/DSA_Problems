public class SingleNumber {
    public static int singleNumber(int[] nums) {

        int result = 0;
        for(int i : nums){
            result ^= i;
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {1,3,4,2,1,4,2};
        System.out.println(singleNumber(arr));
    }
}
