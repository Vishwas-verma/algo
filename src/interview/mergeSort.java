package interview;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

    static void merge(int[] a, int start, int end) {

        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;
        int k = start;
        int[] temp = new int[a.length];

        while (i <= mid && j <= end ) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= end) {
            temp[k++] = a[j++];
        }

        //Copy
        if (end + 1 - start >= 0) System.arraycopy(temp, start, a, start, end + 1 - start);

        // for(int x=start;x<=end;x++)
        // a[x]=temp[x];
    }

    static void mergesort(int[] a, int start, int end) {
        if(end<=start){
            return;
        }
        int mid = (start + end) / 2;
        mergesort(a, start, mid);
        mergesort(a, mid+1, end);
        merge(a, start, end);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = ob.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = ob.nextInt();
        }
        mergesort(a, 0, n - 1);
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
