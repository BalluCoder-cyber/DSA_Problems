public class ProfitValue {
    public static int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int buyIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy,prices[i]);
            if(buy == prices[i]){
                buyIndex = i;
            }
        }
        while (buyIndex < prices.length){
            max = Math.max(max,prices[buyIndex]);
            buyIndex++;
        }


        return (max-buy);
    }

    public static void main(String[] args) {

        int[] arr = {7,11,5,3,6,1};
        System.out.println(maxProfit(arr));
    }
}
