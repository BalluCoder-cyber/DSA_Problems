public class StringToInteger {
    public static int myAtoi(String s) {

        s = s.trim();
        int neg = 1;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i == 0 && c == '-') {
                neg = -1;
                continue;
            } else if (i == 0 && c == '+') {
                continue;
            }

            if (Character.isLetter(c) || c == '-') {
                break;
            } else if (Character.isDigit(c)) {
                if (c == '0' && result == 0) {
                    continue;
                }
                result = result * 10 + (c - '0');
            }
        }

        return result * neg;
    }

    public static void main(String[] args) {
        String s = "  -0123c53";
        System.out.println(myAtoi(s));

    }
}
