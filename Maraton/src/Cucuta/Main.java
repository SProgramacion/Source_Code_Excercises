
package Cucuta;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea = br.readLine(), res, cad = "   ", f;
            StringBuilder b;
            while (!linea.equals("0")) {
                res = factorial(Long.parseLong(linea)) + "";
                System.out.println(linea + "! --");
                for (int i = 0; i < 10; i++) {
                    b = new StringBuilder("     ");
                    f = contar(res + "", i + "");
                    cad += "(" + i + ")" + b.replace((b.length() - f.length()), b.length(), f);
                    cad += (i == 4) ? "\n   " : "    ";
                }
                System.out.println(cad);
                cad = "   ";
                linea = br.readLine();
            }
        } catch (Exception ex) {
        }
    }

    public static String contar(String cadena, String car) {
        return cadena.length() - cadena.replace(car, "").length() + "";
    }

    public static BigInteger factorial(long n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
