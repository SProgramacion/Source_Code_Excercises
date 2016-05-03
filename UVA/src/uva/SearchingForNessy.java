package uva;

import java.io.*;

public class SearchingForNessy {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), m, n;
            String linea;
            for (int i = 0; i < t; i++) {
                linea = tec.readLine();
                n = Integer.parseInt(linea.split(" ")[0]);
                m = Integer.parseInt(linea.split(" ")[1]);
                while (n % 3 != 0 || m % 3 != 0) {
                    if (n % 3 != 0) {
                        n--;
                    }
                    if (m % 3 != 0) {
                        m--;
                    }
                }
                System.out.println((m * n) / 9);
            }
        } catch (Exception ex) {
        }
    }
}
