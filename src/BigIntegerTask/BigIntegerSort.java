package BigIntegerTask;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigIntegerSort {

    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        //Sort the list created above in order
        Comparator<String> comp = Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal b1 = new BigDecimal(o1);
                BigDecimal b2 = new BigDecimal(o2);
                return o1.compareTo(o2);
            }
        });

        Arrays.sort(s, comp);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }
}
