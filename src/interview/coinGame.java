package interview;
import java.util.*;
import java.math.*;

public class coinGame {
    public static void main(String[] args) {
        int[] a = {1, 700, 3, 5, 4};
        System.out.println(game(a, 0, a.length-1));
    }

    static int game(int[] a, int l, int r) {
        if (l + 1 == r) {
            return Math.max(a[l], a[r]);
        }
        return Math.max((a[l] + Math.min(game(a, l + 2, r), game(a, l + 1, r - 1))),( a[r] + Math.min(game(a, l+1, r - 1), game(a, l, r - 2))));
    }
}
