package interview;

public class floodfill {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}
        };
        floodFill(a, 1, 1, 1, 5);
        printMatrix(a);
    }

    static void printMatrix(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void floodFill(int[][] a, int r, int c, int previousFill, int newFill) {
        int row = a.length;
        int column = a[0].length;
        if (r < 0 || r >= row || c < 0 || c >= column) {
            return;
        }
        if (a[r][c] != previousFill) {
            return;
        }
        a[r][c] = newFill;
        floodFill(a, r - 1, c, previousFill, newFill);
        floodFill(a, r, c - 1, previousFill, newFill);
        floodFill(a, r + 1, c, previousFill, newFill);
        floodFill(a, r, c + 1, previousFill, newFill);
    }
}
