import java.util.Scanner;

/*Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if
abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
Here a, b, c and d are digits of input number abcd.....
Examples
Input: n = 153
Output: true
Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153
Input: n = 9474
Output: true
Explanation: 94 + 44 + 74 + 44 = 6561 + 256 + 2401 + 256 = 9474
 */
public class ArmStrongNum {
    public static void armStrongNumber() {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        System.out.println("enter your number");
        int n = s.nextInt();
        String str = Integer.toString(n);
        int power = str.length();
        int temp = n;
        while (n != 0) {
            int result = n % 10;
            n = n / 10;
            sum = sum + Math.pow(result, power);
        }

        if (temp == sum) {
            System.out.println("this number is armstrong");
        } else {
            System.out.println("this number is not not armstrong");
        }
    }
    public static void main(String[] args) {
        armStrongNumber();

    }
}
