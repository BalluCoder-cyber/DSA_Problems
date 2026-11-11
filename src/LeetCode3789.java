public class LeetCode3789 {
    public static long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if (need1 == 0 && need2 == 0)
            return 0;
        long totalCost = 0;
        long bothNeedCost = (long) cost1 + cost2;
        long minReq = (need1 > need2) ? need2 : need1;
        long minCost = (costBoth > bothNeedCost) ? bothNeedCost : costBoth;
        long remReq = (long) (need1 + need2) - 2 * minReq;
        totalCost += minReq * minCost;

        if (minReq == need1) {
            totalCost += (cost2 > costBoth) ? remReq * costBoth : remReq * cost2;
        } else {
            totalCost += (cost1 > costBoth) ? remReq * costBoth : remReq * cost1;
            ;
        }

        return totalCost;

    }
    public static void main(String[] args) {
        System.out.println(minimumCost(3,2,1,3,2));
    }
}
