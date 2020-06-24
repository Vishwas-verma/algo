package interview;

public class recursion {
    public static void main(String[] args) {
        int[][] board = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 0;
            }
        }
        System.out.println(NQueen(4, board, 0));
    }

    static boolean canPlace(int[][] board, int n, int x, int y) {
        //Column
        for (int k = 0; k < x; k++) {
            if (board[k][y] == 1) {
                return false;
            }
        }
        //Left Diag
        int i = x, j = y;
        while (i >= 0 & j >=0){
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        //Right Diag
        while (i >= 0 & j < n){
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }


    static boolean NQueen(int n, int[][] board, int i) {
        //Base Case
        if (i == n) {
            //Print the board
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(board[x][y]);
                }
                System.out.println();
            }
            System.out.println();
            return false;
        }
        //Rec Case
        //Try to place queen at every column/position in the current row
        for (int j = 0; j < n; j++) {
            if (canPlace(board, n, i, j)) {
                board[i][j] = 1;
                boolean aageQueenRakhPayeKya = NQueen(n, board, i + 1);
                if (aageQueenRakhPayeKya) {
                    return true;
                }
                board[i][j] = 0;
            }
        }
        return false;
    }
}
