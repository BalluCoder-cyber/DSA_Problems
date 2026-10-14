public class LeetCode3723 {
    public static String maxSumOfSquares(int num, int sum) {
        StringBuilder val = new StringBuilder();
        while (num > 0) {
            if (sum >= 9) {
                val.append(9);
                sum -= 9;
                num--;
            } else if (sum == 0) {
                val.append(0);
                num--;

            } else {
                val.append(sum);
                sum -= sum;
                num--;
            }
            if (num == 0 && sum != 0) {
                return "__";
            }
        }
        return val.toString();
    }
    public static void main(String[] args) {
        System.out.println(maxSumOfSquares(8,9000));

    }
}
