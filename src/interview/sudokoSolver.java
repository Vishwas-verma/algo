package interview;

public class sudokoSolver {

    static boolean canPlace(int[][] board, int r, int c, int num) {
        for (int x = 0; x < board.length; x++) {
            if (board[r][x] == num) {
                return false;
            }
            if (board[x][c] == num) {
                return false;
            }
        }
        int div = (int) Math.sqrt(board.length);
        int startRow = r - r % div;
        int startCol = c - c % div;
        for (int d = startRow; d < startRow + div; d++) {
            for (int e = startCol; e < startCol + div; e++) {
                if (board[d][e] == num) return false;
            }
        }
        return true;
    }

    static boolean solver(int[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        if (col == board.length) {
            return solver(board, row + 1, 0);
        }
        if (board[row][col] != 0) {
            return solver(board, row, col + 1);
        }
        for (int curNum = 1; curNum <= board.length; curNum++) {
            if (canPlace(board, row, col, curNum)) {
                board[row][col] = curNum;
                boolean success = solver(board, row, col + 1);
                if (success) return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        boolean ans = solver(board, 0, 0);
        if (ans) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + "  ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Sorry Bro It Cannot Be Solved");
        }
    }
}
