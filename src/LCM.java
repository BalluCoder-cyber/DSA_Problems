public class LCM {
    static int lcm(int a,int b){
        if(a==b)return a;
        int large = Math.max(a,b);
        int small = Math.min(a,b);
        for(int i = large; i<=small*large; i+=large){
            if(i%small==0) return i;
        }
        return large*small;
    }
    public static void main(String[] args) {
        System.out.println(lcm(3,31));

    }
}
