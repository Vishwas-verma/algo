package interview;

public class shortestPathInMaze {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
        };
        int result = shortestPath(a, 0, 0, 8, 0 );
        System.out.println(result);
    }

    static boolean isValid(int[][] a, int i, int j, boolean[][] vis) {
        int rows = a.length;
        int column = a[0].length;

        return i >= 0 && j >= 0 && i < rows && j < rows && a[i][j] == 1 && !vis[i][j];
    }

    static int shortestPath(int[][] a, int i, int j, int x, int y) {
        int rows = a.length;
        int column = a[0].length;

        boolean[][] visited = new boolean[rows][column];
        return shortestPath(a, i, j, x, y, visited);
    }

    static int shortestPath(int[][] a, int i, int j, int x, int y, boolean[][] vis) {
        if (!isValid(a, i, j, vis)) return 999999;
        if (i == x && j == y) return 0;
        vis[i][j] = true;
        int left = shortestPath(a, i, j - 1, x, y, vis)+1;
        int right = shortestPath(a, i, j + 1, x, y, vis)+1;
        int top = shortestPath(a, i - 1, j, x, y, vis)+1;
        int bottom = shortestPath(a, i + 1, j, x, y, vis)+1;
        vis[i][j] = false;

        return Math.min(Math.min(left, bottom), Math.min(top, right));
    }
}
