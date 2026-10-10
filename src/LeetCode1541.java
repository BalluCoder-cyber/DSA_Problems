public class LeetCode1541 {
    public static int minInsertions(String s) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open += 2;
            }
            if (s.charAt(i) == ')') {
                if (open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
        return open + (close / 2);
    }

    public static void main(String[] args) {
        String s = "))())(";
        System.out.println(minInsertions(s));
    }
}
