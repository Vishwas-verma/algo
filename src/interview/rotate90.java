package interview;

/*package whatever //do not write package name here */

import java.util.Scanner;

public class rotate90 {

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //code
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while (t-- > 0) {
            int n = ob.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = ob.nextInt();
                }
            }

            //Transpose

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }

            // Swap

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[n - 1 - i][j];
                    a[n - 1 - i][j] = temp;
                }
            }
            printMatrix(a);
            System.out.println();
        }
    }
}