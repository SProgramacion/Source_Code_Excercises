package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class A_new {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            BigInteger s, x;

            while (tec.hasNextLong()) {
                s = tec.nextBigInteger();
                x = tec.nextBigInteger();
                System.out.println(calcular(s, x));
            }
            System.out.println("");
        } catch (Exception ex) {

        }
    }

    public static int calcular(BigInteger s, BigInteger x) {
        BigInteger a, b, l = s.divide(BigInteger.valueOf(2));
        int cont = 0;
        for (int i = 1; i <= l.longValue(); i++) {
            a = BigInteger.valueOf(i);
            b = s.subtract(a);
            //System.out.println(a + "," + b);
            if (a != b && get(a, b, x)) {
                //System.out.println(a + "," + b);
                cont++;
            }
        }

        return cont * 2;
    }

    public static boolean get(BigInteger a, BigInteger b, BigInteger x) {
        return (a.xor(b)).compareTo(x) == 0;
    }
}
