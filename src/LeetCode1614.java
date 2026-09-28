public class LeetCode1614 {
    public static int maxDepth(String s) {
        int max = 0;
        int count =0;
        char[] s2 = s.toCharArray();
        for(int i = 0; i<s2.length; i++){
           if(s2[i] == '('){
               count++;
               if(count > max){
                   max = count;
               }
           }
           if(s2[i] == ')'){
               count--;

           }
        }
        return max;
    }
    public static void main(String ags[]){
        System.out.println(maxDepth("(((sjsk)))dkj("));
    }
}
