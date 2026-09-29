import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = happy(n);
        }
        return n == 1;
    }

    public static int happy(int num) {
        int sum = 0;
        while (num > 0) {
            int lastV = num % 10;
            sum += lastV * lastV;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}


