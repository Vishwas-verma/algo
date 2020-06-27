package interview;

import java.util.Scanner;

public class quickSort {


    public static int partition(int[] a, int s, int e) {
        int pivot = a[e];
        int i = s - 1;
        int j = s;
        for (; j < e; j++) {
            if (a[j] <= pivot) {
                i++;
                //     swap(a[i], a[j]);
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
      //  swap(a[i + 1], a[e]);

        int temp = a[i + 1];
        a[i + 1] = a[e];
        a[e] = temp;
        return i + 1;
    }

    public static void quicksort(int[] a, int start, int end) {
        if (start >= end) return;

        int p = partition(a, start, end);
        quicksort(a, start, p - 1);
        quicksort(a, p + 1, end);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ob.nextInt();
        }
        quicksort(a, 0, n - 1);
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
