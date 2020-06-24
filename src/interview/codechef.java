package interview;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while (t-- > 0) {
            int n = ob.nextInt();
            int[] a = new int[n];
            int i, j;
            boolean sell = true;
            for (i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }
            int c = 0;
            int cnew = 0;
            if (a[0] == 5) {
                while (i++ < n) {
                    if (a[i] == 5) {
                        c++;
                    } else if (a[i] == 10) {
                        cnew++;
                        if (c > 0) {
                            c--;
                        } else {
                            sell = false;
                            break;
                        }
                    } else if (a[i] == 15) {
                        if (cnew == 0) {
                            if (c > 0) {
                                c = c - 2;
                            } else {
                                sell = false;
                                break;
                            }
                        } else {
                            if (cnew > 0)
                                cnew--;
                            else {
                                sell = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (sell)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

