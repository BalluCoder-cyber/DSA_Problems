public class LeetCode3612 {
    public static String processStr(String s) {

        StringBuilder result = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                result.append(s.charAt(i));
            } else if (s.charAt(i) == '*' && !result.isEmpty()) {
                result.deleteCharAt(result.length()-1);
            } else if (s.charAt(i) == '#') {
                result.append(result);
            } else if (s.charAt(i) == '%') {
                result.reverse();
            }

        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "z*#";
        System.out.println(processStr(s));
    }
}
