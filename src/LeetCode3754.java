public class LeetCode3754 {
    public static void sumAndMultiply(int n) {

        long sum = 0;
        String str = String.valueOf(n);
        StringBuilder con  = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '0'){
                con.append(str.charAt(i));
            }
        }
        for(int i=0; i<con.length(); i++){
            sum += (int) con.charAt(i)-'0';
        }


        System.out.println(sum * (Integer.parseInt(String.valueOf(con))));;
    }
    public static void main(String[] args) {
        sumAndMultiply(10023040);
    }
}
