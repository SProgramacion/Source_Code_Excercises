package uva;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextQuotes {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            boolean estado = false;
            do {
                linea = tec.readLine();
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.substring(i, i + 1).equals("\"")) {
                        if (estado) {
                            linea = linea.substring(0, i) + "''" + linea.substring(i + 1, linea.length());
                        } else {
                            linea = linea.substring(0, i) + "``" + linea.substring(i + 1, linea.length());
                        }
                        estado = !estado;
                    }
                }
                System.out.println(linea);
            } while (!linea.equals(""));
        } catch (Exception ex) {
        }
    }

}
