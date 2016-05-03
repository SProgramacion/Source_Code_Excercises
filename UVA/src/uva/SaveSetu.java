package uva;

import java.io.*;

public class SaveSetu {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), valor = 0;
            String linea;
            for (int i = 0; i < t; i++) {
                linea = tec.readLine();
                if (linea.startsWith("donate")) {
                    valor += Integer.parseInt(linea.split(" ")[1]);
                } else {
                    System.out.println(valor);
                }

            }
        } catch (Exception ex) {
        }
    }
}
