import java.util.Arrays;

public class LeetCode1833 {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int countIce = 0;
        int sumCost = 0;

        for (int i = 0; i < costs.length; i++) {
            sumCost += costs[i];
            if (sumCost <= coins) {
                countIce++;
            } else {
                break; // stop once you exceed coins
            }
        }
        return countIce;
    }
    public static void main(String[] args) {

        int [] arr = {3,5,2,1,5,3,2};
        int coin = 24;
        System.out.println(maxIceCream(arr,coin));
    }
}
