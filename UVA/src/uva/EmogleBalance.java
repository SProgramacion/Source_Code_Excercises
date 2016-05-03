package uva;

import java.io.*;

public class EmogleBalance {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int a = 0, b = 0, cont = 0;
            String n = tec.readLine(), linea = tec.readLine();
            String[] ar;
            while (!n.equals("0")) {
                cont++;
                ar = linea.split(" ");
                for (String ar1 : ar) {
                    if (ar1.equals("0")) {
                        b++;
                    } else {
                        a++;
                    }
                }
                System.out.println("Case " + cont + ": " + (a - b));
                a = b = 0;
                n = tec.readLine();
                linea = tec.readLine();
            }
        } catch (Exception ex) {
        }
    }
}
