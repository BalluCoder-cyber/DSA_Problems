public class LeetCode2333 {
    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long sum = 0;
        long k = (long) k1 + k2;

        while (k > 0) {
            int max1 = findIndex1(nums1, nums2);
            int max2 = findIndex2(nums1, nums2);
            int diff1 = (max1 == -1) ? -1 : Math.abs(nums1[max1] - nums2[max1]);
            int diff2 = (max2 == -1) ? -1 : Math.abs(nums1[max2] - nums2[max2]);

            if (diff1 == 0 || diff2 == 0) {
                if (diff1 <= 0 && diff2 <= 0) {
                    break;
                }
            }

            if (diff1 >= diff2 && max1 != -1) {
                nums1[max1]++;
            } else if (max2 != -1) {
                nums2[max2]++;
            } else {
                break;
            }

            k--;
        }

        for (int i = 0; i < nums1.length; i++) {
            long diff = Math.abs(nums1[i] - nums2[i]);
            sum += diff * diff;
        }

        return sum;
    }

    public static int findIndex1(int[] nums1, int[] nums2) {
        int maxDiff = 0;
        int maxIndex = -1;

        for (int i = 0; i < nums1.length; i++) {

            int diff = Math.abs(nums1[i] - nums2[i]);

            if (diff > maxDiff && nums1[i] < nums2[i]) {
                maxDiff = diff;
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int findIndex2(int[] nums1, int[] nums2) {
        int maxDiff2 = 0;
        int maxIndex2 = -1;

        for (int i = 0; i < nums2.length; i++) {

            int diff2 = Math.abs(nums2[i] - nums1[i]);

            if (diff2 > maxDiff2 && nums1[i] > nums2[i]) {
                maxDiff2 = diff2;
                maxIndex2 = i;
            }
        }
        return maxIndex2;
    }
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4};
        int[] num2 = {2, 10, 20, 19};
        int k1 = 0;
        int k2 = 0;
        System.out.println(minSumSquareDiff(num1, num2, k1, k2));

    }
}
