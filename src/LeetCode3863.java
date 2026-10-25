import java.util.Arrays;

public class LeetCode3863 {
    public static void minOperations(String s) {
        if (s.length() < 3) {
            System.out.println(-1);
        }
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        minOperations("card");
    }
}
