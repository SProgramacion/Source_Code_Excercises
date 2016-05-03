package Cucuta;

import java.util.Scanner;

public class Dora {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        long n = tec.nextLong();
        while (n != 0) {
            if (n >= 1 && n <= (2 * Math.pow(10, 18))) {
                System.out.println((n == 1) ? "1 1" : Calcular(n));
                n = tec.nextLong();
            }
        }
    }

    public static String Calcular(long n) {
        long i = 2, j = 1, c1 = 2, c2 = 1;
        boolean aum_i = false;
        for (int x = 3; x <= n; x++) {
            if (i == c2 && j == c1) {
                j += (i == 1) ? 1 : 0;
                i += (j == 1) ? 1 : 0;
                aum_i = !aum_i;
                c1 = i;
                c2 = j;
            } else {
                if (aum_i) {
                    i++;
                    j--;
                } else {
                    i--;
                    j++;
                }
            }
        }
        return j + " " + i;
    }
}

//https://netbeans.org/downloads/

