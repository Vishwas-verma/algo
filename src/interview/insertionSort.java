package interview;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int hole = i;
            int value = a[i];
            while (hole > 0 && a[hole - 1] > value) {
                a[hole] = a[hole - 1];
                hole = hole - 1;
            }
            a[hole] = value;
        }
        for (int elm : a) {
            System.out.print(elm + ",");
        }
    }
}
