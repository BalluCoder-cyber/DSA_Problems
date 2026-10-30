public class LeetCode62 {
    public static void uniquePaths(int m, int n) {
        int totalLRMove = (n - 1) + (m - 1);
        int nfact = 1;
        int mfact = 1;
        int totalLRMovefact = 1;
        for (int i = 1; i <= totalLRMove; i++) {
            if (i < n) {
                nfact *= i;
            }
            if (i < m) {
                mfact *= i;
            }
            if (i <= totalLRMove) {
                totalLRMovefact *= i;
            }
        }

        System.out.println(totalLRMovefact / (nfact * mfact));
    }

    public static void main(String[] args) {
        uniquePaths(3,7);

    }
}
