public class LeetCode3105 {
    public static int longestMonotonicSubarray(int[] nums) {
        return longSize(nums,1,1,1,1);
    }

    public static int longSize(int[] arr, int i,int inc, int dec, int ans){
        if(i == arr.length) return ans;
        if(arr[i]>arr[i-1]){
            inc++;
            dec = 1;
        }else if(arr[i]<arr[i-1]){
            dec++;
            inc = 1;
        }else{
            inc = 1;
            dec = 1;
        }
        ans = Math.max(ans,Math.max(inc,dec));

        return longSize(arr,i+1,inc,dec,ans);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,1,3};
        System.out.println(longestMonotonicSubarray(arr));
    }
}
