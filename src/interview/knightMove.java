package interview;

import java.util.Scanner;

public class knightMove {
    static boolean kmove(int[][] board, int moveCount, int currRow, int currCol) {
        int c = board.length;
        if (moveCount == c * c) {
        //    return true;
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(board[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("-------------------------------");
        }
        int[] rowDir = {+2, +1, -1, -2, -2, -1, +1, +2};
        int[] colDir = {+1, +2, +2, +1, -1, -2, -2, -1};
        for (int cur = 0; cur < 8; cur++) {
            int nextRow = currRow + rowDir[cur];
            int nextCol = currCol + colDir[cur];
            if (canPlace(board, nextRow, nextCol)) {
                board[nextRow][nextCol] = moveCount + 1;
                boolean successful = kmove(board, moveCount + 1, nextRow, nextCol);
              //  if (successful) return true;
                board[nextRow][nextCol] = 0;
            }
        }
        return false;
    }

    static boolean canPlace(int[][] board, int row, int col) {
        int r = board.length;
        return row >= 0 && row < r && col >= 0 && col < r && board[row][col] == 0;
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
        board[0][0] = 1;
        boolean ans = kmove(board, 1, 0, 0);
//        if (ans) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(board[i][j] + "  ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Sorry Knight Cannot Move");
//        }
    }
}
