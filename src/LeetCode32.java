import java.util.Stack;

public class LeetCode32 {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxInd = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxInd = Math.max(maxInd, i-stack.peek());
                }
            }
        }

        return maxInd;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("((()())"));
    }
}
