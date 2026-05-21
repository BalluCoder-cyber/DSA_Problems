
import java.util.Arrays;

public class SortedArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i = 0; i<n;i++){
          nums1[m+i] = nums2[i];
      }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr1 = {3,2,5};
        merge(arr,3,arr1,3);
    }
}
