public class LeetCode3665 {
    public static void uniquePaths(int[][] grid) {
        int result = 1;
        int m = grid.length;
        int n = grid[0].length;
        int mirrorMax = 0;
        int countmirror = 0;
        for (int i = 1; i <= Math.min(m - 1, n - 1); i++) {
            result = result * (m + n - 1 - i) / i;
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    countmirror++;
                    mirrorMax = Math.max(mirrorMax,countmirror);
                }
            }
            System.out.println(mirrorMax);
            countmirror = 0;
        }

        System.out.println(result-mirrorMax);
    }
    public static void main(String[] args) {
         int [][] grid = {{0, 1, 1},{1, 1, 0}};
        uniquePaths(grid);

    }
}
