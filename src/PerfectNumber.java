/*A number is a perfect number if it is equal to the sum of its proper divisors, that is, the sum of its positive divisors excluding the number itself. Find whether a given positive integer n is perfect or not.
Examples:
Input: n = 15
Output: false
Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.
Input: n = 6
Output: true
Explanation: Divisors of 6 are 1, 2 and 3. Sum of divisors is 6.
*/
public class PerfectNumber {
    static boolean numberIsPerfect(int num){
        if(num==1) return true;
        int sum =0;
        for(int i = 1; i< num; i++){
            if(num%i == 0){
                sum += i;
            }
            if(sum == num) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(numberIsPerfect(6));

    }
}
