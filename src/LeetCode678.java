public class LeetCode678 {
    public static boolean checkValidString(String s) {
        int last = s.length() - 1;
        if (s.charAt(0) == ')' || s.charAt(last) == '(') {
            return false;
        }
        int balance = 0;
        int open = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '(') {
                balance++;
                open++;
            }
            if(s.charAt(i) == ')') {
                balance--;
                open--;
            }
            if(s.charAt(i) == '*') {
                balance--;
                open++;
            }
            if(open < 0){
                return false;
            }
            balance = Math.max(0,balance);
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println( checkValidString("(*))"));
    }
}
