package uva;

import java.io.*;

public class RelationalOperator {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(tec.readLine()), a, b;
            String linea;
            for (int i = 0; i < n; i++) {
                linea = tec.readLine();
                a = Integer.parseInt(linea.split(" ")[0]);
                b = Integer.parseInt(linea.split(" ")[1]);
                System.out.println(a == b ? "=" : (a < b) ? "<" : ">");
            }
        } catch (Exception ex) {
        }
    }
}
