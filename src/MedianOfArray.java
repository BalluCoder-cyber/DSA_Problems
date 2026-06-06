import java.util.Arrays;

public class MedianOfArray {
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] result = new int[l1+l2];
        int resIdx = result.length%2;
        int i = 0; int j= 0; int k=0;
        while (i < l1 && j< l2){
            if(nums1[i] <= nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }
        while (i<l1){
            result[k++] = nums1[i++];
        }
        while (j<l2){
            result[k++] = nums2[j++];
        }

        int idx = result.length/2;
        if(resIdx%2 != 0){
            median = result[idx];
        }else {
            median = (double) (result[idx] + result[idx-1])/2;
        }

        System.out.println(Arrays.toString(result));
        System.out.println(median);
    }
    public static void main(String[] args) {
        int[]num1 = {1,3,5,9};
        int[]num2 = {2,4,6,7};
        findMedianSortedArrays(num1,num2);
    }
}
