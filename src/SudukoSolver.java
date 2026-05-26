public class SudukoSolver {
    public static void solveSudoku(char[][] board) {
        backtrack(board);
    }
    private static boolean backtrack(char[][] board){
        for(int i = 0 ; i < 9 ;i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] =='.'){
                    for(char c = '1'; c<=9; c++){
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;
                            if(backtrack(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i<9;i++){
            if(board[row][i] == c)return false;
            if(board[i][col]== c) return false;
            int boxR = 3*(row/3)+i/3;
            int boxC = 3*(col/3)+i%3;
            if(board[boxR][boxC] == c) return false;

        }
        return true;
    }

    public static void main(String[] args) {

    }
}
