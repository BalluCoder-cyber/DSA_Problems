public class LeetCode3164 {
    public static char processStr(String s, long k) {
        StringBuilder result = new StringBuilder();
        char ch = '.';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                result.append(s.charAt(i));
            } else if (s.charAt(i) == '*' && !result.isEmpty()) {
                result.deleteCharAt(result.length() - 1);
            } else if (s.charAt(i) == '#') {
                result.append(result);
            } else if (s.charAt(i) == '%') {
                result.reverse();
            }

        }
        if(k < result.length()){
            ch = result.charAt((int) k);
        }



        return ch;
    }
    public static void main(String[] args) {
        String s = "a#b%*";
        long k = 1;
        System.out.println(processStr(s,k));

    }
}
