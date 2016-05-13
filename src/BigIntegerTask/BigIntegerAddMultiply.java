package BigIntegerTask;

import java.util.*;
import java.math.*;

public class BigIntegerAddMultiply {

    public static void main(String[] args) {
        /* Receives two number on two lines
        Output first line as a+b ; Output second line as a*b */

        Scanner sc = new Scanner(System.in);
        BigInteger input = sc.nextBigInteger();
        BigInteger inputTwo = sc.nextBigInteger();

        System.out.println(input.add(inputTwo));
        System.out.println(input.multiply(inputTwo));

    }
}

