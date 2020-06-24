package interview;
/*package whatever //do not write package name here */
import java.util.Scanner;
public class rotateArray {
    static void reverse(int[] a, int start, int end) {
        while (start <= end) {

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        //code
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while (t-- > 0) {
            int n = ob.nextInt();
            int d = ob.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }
            reverse(a, 0, a.length - 1);
            reverse(a, 0, a.length - d - 1);
            reverse(a, a.length - d, a.length - 1);

            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}