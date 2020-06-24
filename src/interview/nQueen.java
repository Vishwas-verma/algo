package interview;

import java.util.Scanner;

public class nQueen {

    static boolean canPlace(int[][] board, int i, int j) {
        for (int k = 0; k < i; k++) {
            if (board[k][j] == 1)
                return false;
        }
        int x = i, y = j;
        while (x >= 0 & y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y--;
        }

        //Right Diag
        x = i;
        y = j;
        while (x >= 0 & y < board.length) {
            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y++;
        }
        return true;
    }

    static boolean solveNqueen(int[][] board, int i) {
        if (i == board.length) {
            for (int[] x : board) {
                for (int y = 0; y < board.length; y++) {
                    System.out.print(x[y] + " ");
                }
                System.out.println();
            }
            System.out.println("=======");
            return false;
        }
        for (int j = 0; j < board.length; j++) {
            if (canPlace(board, i, j)) {
                board[i][j] = 1;
                boolean nextQueen = solveNqueen(board, i + 1);
                if (nextQueen)
                    return true;
                board[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
        solveNqueen(board, 0);
    }
}
