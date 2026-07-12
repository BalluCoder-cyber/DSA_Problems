import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1331 {
    public static int[] arrayRankTransform(int[] arr) {

        Map<Integer, Integer> rankMap = new HashMap<>();
        int[] sortedArray = arr.clone();

        Arrays.sort(sortedArray);

        int rank = 1;

        for (int x : sortedArray) {
            if (!rankMap.containsKey(x)) {
                rankMap.put(x, rank);
                rank++;
            }
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(arrayRankTransform(arr));
    }
}
