import java.util.Arrays;

public class LeetCode48 {
    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int[][] matrix2 = new int[m][m];
        int n = matrix.length-1;
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                matrix2[i][j] = matrix[n-j][i];
            }
        }

        System.out.println(Arrays.deepToString(matrix2));
    }
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(m);
    }
}
