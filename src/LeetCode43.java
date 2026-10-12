public class LeetCode43 {
    public static String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int mul = a * b;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int digit : result) {
            if (ans.length() == 0 && digit == 0) {
                continue;
            }

            ans.append(digit);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        System.out.println(multiply(num1, num2));
    }
}
