package codeforces;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            long s, x;

            while (tec.hasNextLong()) {
                s = tec.nextLong();
                x = tec.nextLong();
                System.out.println(calcular(s, x));
            }
            System.out.println("");
        } catch (Exception ex) {

        }
    }

    public static int calcular(long s, long x) {
        long a, b;
        int cont = 0;
        for (int i = 1; i < s; i++) {
            a = i;
            b = s - i;
            if (get(a, b, x)) {
                //System.out.println(a + "," + b);
                cont++;
            }
        }
        return cont;
    }

    public static String get(int m) {
        String h = "";
        for (int i = 0; i < m; i++) {
            h += "0";
        }
        return h;
    }

    public static boolean get(long a, long b, long x) {
        char[] n1 = Long.toBinaryString(a).toCharArray();

        char[] n2 = Long.toBinaryString(b).toCharArray();
        int dif = Math.abs(n1.length - n2.length);
        if (n1.length > n2.length) {
            n2 = get(dif).concat(String.valueOf(n2)).toCharArray();
        } else {
            n1 = get(dif).concat(String.valueOf(n1)).toCharArray();
        }
        return Long.parseLong(result(n1, n2), 2) == x;
    }

    public static String result(char[] n1, char[] n2) {
        String res = "";
        for (int i = 0; i < n1.length; i++) {
            res += (n1[i] == n2[i]) ? "0" : "1";
        }
        return res;
    }

    public static void llenar() {

    }

}
