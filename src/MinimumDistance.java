public class MinimumDistance {
    /* A tuple (i, j, k) of 3 distinct indices is good if nums[i] == nums[j] == nums[k].

    The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.

    Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.
    RETURN MINIMUM DISTANCE BETWEEN THREE EQUAL ELEMENTS */
    public static int minimumDistanceInTuples(int[] nums){
        int n = nums.length;
        if(n<2) return -1;
        int result = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j= i+1; j<n; j++){
                if(nums[i]==nums[j]){
                  for(int k=j+1; k<n; k++){
                      if(nums[k]==nums[j]){
                          result = Math.min(result,2*(k-i));
                      }
                  }
                }
            }
        }
        return result==Integer.MAX_VALUE ? -1: result;
    }
    public static void main(String[]args){
        int[] arr  = {1,2,1,1,3};

        System.out.println(minimumDistanceInTuples(arr));

    }
}
