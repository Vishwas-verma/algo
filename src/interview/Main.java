package interview;

public class Main {

    public static void main(String[] args) {
        //  System.out.println(power1(3, 4));
        //  System.out.println(ways(2, 2));
       // increasingPrint(5);
       decreasingPrint(5);
    }

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        return a * power(a, b - 1);
    }

    static int power1(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return power1(a * a, b / 2);
        }
        return a * power(a, b - 1);
    }

    static int ways(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return ways(n, m - 1) + ways(n - 1, m);
    }

    static void increasingPrint(int n) {
        if(n==0){
            return;
        }
        increasingPrint(n-1);
        System.out.println(n);
    }
    static void decreasingPrint(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingPrint(n-1);
    }
}
