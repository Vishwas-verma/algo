package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class permiutation {
    static Set<String> set=new HashSet<>();
    public static void main(String[] args) {
        permutationString("abcc", 0, 3);
    }

    static void permutationString(String s, int l, int r) {
        if (l == r) {
            if(set.contains(s)) return;
            set.add(s);
            System.out.println(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = interchange(s, l, i);
            permutationString(s, l + 1, r);
            s = interchange(s, l, i);
        }
    }

    static String interchange(String s, int a, int b) {
        char[] ch = s.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return String.valueOf(ch);
    }
}
