package uva;

import java.io.*;

public class NLogonia {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int k = Integer.parseInt(tec.readLine()), n, m, x, y;
            String linea;
            String[] ar;
            while (k != 0) {
                linea = tec.readLine();
                ar = linea.split(" ");
                n = Integer.parseInt(ar[0]);
                m = Integer.parseInt(ar[1]);
                for (int i = 0; i < k; i++) {
                    linea = tec.readLine();
                    ar = linea.split(" ");
                    x = Integer.parseInt(ar[0]);
                    y = Integer.parseInt(ar[1]);
                    System.out.println((x == n || y == m) ? "divisa" : (x > n && y > m) ? "NE" : (x < n && y > m) ? "NO"
                            : (x < n && y < m) ? "SO" : "SE");
                }
                k = Integer.parseInt(tec.readLine());
            }
        } catch (Exception ex) {
        }
    }
}
