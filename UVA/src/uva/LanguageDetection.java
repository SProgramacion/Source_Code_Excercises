package uva;

import java.io.*;

public class LanguageDetection {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            String linea = tec.readLine();
            int cont = 0;
            while (!linea.equals("#")) {
                cont++;
                System.out.println(linea.equals("HELLO") ? "Case " + cont + ": ENGLISH" : linea.equals("HOLA") ? "Case " + cont + ": SPANISH" : linea.equals("HALLO") ? "Case " + cont + ": GERMAN" : linea.equals("BONJOUR") ? "Case " + cont + ": FRENCH" : linea.equals("CIAO") ? "Case " + cont + ": ITALIAN" : linea.equals("ZDRAVSTVUJTE") ? "Case " + cont + ": RUSSIAN" : "Case " + cont + ": UNKNOWN");
                linea = tec.readLine();
            }
        } catch (Exception ex) {
        }
    }
}
