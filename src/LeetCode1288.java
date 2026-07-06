import java.util.Arrays;

public class LeetCode1288 {
    public static int removeCoveredIntervals(int[][] intervals) {
        int remaining = 0;
        Arrays.sort(intervals,(a, b)->{
            if(a[0] != b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(b[1],a[1]);
        });

        int maxEnd =0;
        for(int[] interval : intervals){
            if(interval[1] > maxEnd){
                remaining++;
                maxEnd = interval[1];
            }
        }
        return remaining;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{2,4}};
        System.out.println(removeCoveredIntervals(arr));
    }
}
