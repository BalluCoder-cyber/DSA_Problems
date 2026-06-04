public class TotalWaviness {
    public static void totalWaviness(int num1, int num2) {

        int count = 0;
        while (num1 <= num2) {
            String num = Integer.toString(num1);
            for (int i = 1; i < num.length() - 1; i++) {
                if (num.charAt(i) < num.charAt(i - 1) && num.charAt(i) < num.charAt(i + 1)) {
                    count++;
                } else if (num.charAt(i) > num.charAt(i - 1) && num.charAt(i) > num.charAt(i + 1)) {
                    count++;
                }
            }
            num1++;

        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        totalWaviness(120, 130);
    }
}
