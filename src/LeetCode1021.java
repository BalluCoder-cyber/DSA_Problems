public class LeetCode1021 {
    public static String removeOuterParentheses(String s) {
        StringBuilder s2 = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    s2.append('(');
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    s2.append(')');
                }

            }
        }
        return s2.toString();
    }

    public static void main(String[] args) {
        String s = "((())()()())()";
        System.out.println(removeOuterParentheses(s));
    }
}
