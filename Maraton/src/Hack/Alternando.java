
package Hack;

import java.util.Scanner;

public class Alternando {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            int T = Integer.parseInt(tec.nextLine());
            String cad;
            while (T > 1 && T <= 10) {
                for (int i = 0; i < T; i++) {
                    cad = tec.nextLine();
                    System.out.println("" + Calcular(cad));
                }
                T = Integer.parseInt(tec.nextLine());
            }
        } catch (Exception ex) {
        }
    }

    public static int Calcular(String cad) {
        int cont = 0;
        for (int i = 1; i < cad.length(); i++) {
            if (cad.substring(i - 1, i).equals(cad.substring(i, i + 1))) {
                cont++;
            }
        }
        return cont;
    }
}
