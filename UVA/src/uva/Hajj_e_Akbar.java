package uva;

import java.io.*;

public class Hajj_e_Akbar {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            String linea = tec.readLine();
            int cont = 0;
            while (!linea.equals("*")) {
                cont++;
                System.out.println(linea.equals("Hajj") ? "Case " + cont + ": Hajj-e-Akbar" : "Case " + cont + ": Hajj-e-Asghar");
                linea = tec.readLine();
            }
        } catch (Exception ex) {
        }
    }
}
