package interview;

import java.util.Scanner;

public class spiralMatrix1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the dimension");
        int n = ob.nextInt();
        int[][] a = new int[n][n];

        int c = 1;
        int left = 0, top = 0;
        int bottom = n - 1, right = n - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                a[top][i] = c++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right] = c++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bottom][i] = c++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                a[i][left] = c++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
