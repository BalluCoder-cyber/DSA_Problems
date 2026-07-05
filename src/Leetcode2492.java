public class Leetcode2492 {
    public static int minScore(int n, int[][] roads) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i<roads.length;i++){
            min = Math.min(roads[i][2],min) ;
        }
        return min;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = {{1,2,9},{2,3,6},{2,4,5}};
        System.out.println(minScore(n,arr));
    }
}
