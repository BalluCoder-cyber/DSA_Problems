public class LCM {
    // First Method ....
   /* static int lcm(int a,int b){
        if(a==b)return a;
        int large = Math.max(a,b);
        int small = Math.min(a,b);
        for(int i = large; i<=small*large; i+=large){
            if(i%small==0) return i;
        }
        return large*small;
    }*/

    // Method Second by using relation of LCM or HCF...
    static int gcd(int a, int b){
        return(b==0) ? a : gcd(b,a%b);
    }
    static int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public static void main(String[] args) {
        System.out.println(lcm(16,28));

    }
}
