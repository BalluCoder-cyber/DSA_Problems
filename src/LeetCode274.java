import java.util.Arrays;
public class LeetCode274 {
    public static void hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = Integer.MIN_VALUE;
        int research = citations.length;
        System.out.println(Arrays.toString(citations));
        for(int i = 0; i < citations.length; i++){
            if(citations[i] >= research){
                hIndex = Math.max(research,hIndex);
            }
            research--;
        }
        System.out.println( hIndex);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1};
        hIndex(arr);

    }
}
