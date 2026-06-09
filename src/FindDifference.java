public class FindDifference {
    public static char findTheDifference(String s, String t) {

        char result =0;
        for( char ch : s.toCharArray()){
            result ^= ch;
        }
        for(char ch : t.toCharArray()){
            result ^= ch;
        }
        return result;
    }
    public static void main(String[] args) {
        findTheDifference("abc","abdc");
        System.out.println( findTheDifference("abc","abdc"));
    }
}
