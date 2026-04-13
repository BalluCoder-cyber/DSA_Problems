public class ArrayMinDis {
    public static int minDistance(int[]nums, int target, int start){
        if(start == 0 && target ==1 ){
            return 0;
        }
        int result=nums.length;
        for(int i =0; i<nums.length; i++){
            if(nums[i]== target){
                result = Math.min(Math.abs(i-start),result);
            }
        }
        return result;

     }
    public static void main (String[] args){
        int[] n={1,2,3,4,5};

        System.out.println( minDistance(n,5,3));


    }
}
