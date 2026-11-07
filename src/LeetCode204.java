import java.util.Arrays;

public class LeetCode204 {
    public static int countPrimes(int n) {
        if(n <= 2) return 0;
        int count = 0;
        boolean[] primeArr = new boolean[n];
        Arrays.fill(primeArr,true);
        primeArr[0] = false;
        primeArr[1] = false;
        for(int i=2;i*i<n; i++){
            if(primeArr[i]){
                for(int j=i*i; j<n; j+=i ){
                    primeArr[j] = false;
                }
            }

        }

        for(int i=2; i<n; i++){
            if(primeArr[i]){
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        System.out.println(countPrimes(30));

    }
}
