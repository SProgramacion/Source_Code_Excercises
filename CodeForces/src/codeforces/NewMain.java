package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            int s, x;

            while (tec.hasNextLong()) {
                s = tec.nextInt();
                x = tec.nextInt();
                System.out.println(calcular(s, x));
            }
            System.out.println("");
        } catch (Exception ex) {

        }
    }

    public static int calcular(int s, int x) {
        int mayor = 0;
        int cont = 0;
        for (int i = s; i <= x; i++) {
            for (int j = s; j <= x; j++) {
                cont = get(i,j);
                if (cont > mayor) {
                    mayor = cont;
                }
            }
        }

        return mayor;
    }

    public static int get(int a, int b) {
        return (BigInteger.valueOf(a).xor(BigInteger.valueOf(b))).intValue();
    }
}
