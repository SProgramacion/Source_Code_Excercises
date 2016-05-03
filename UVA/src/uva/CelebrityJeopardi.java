package uva;

import java.io.*;

public class CelebrityJeopardi {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            String linea = tec.readLine();
            while (!linea.equals("")) {
                System.out.println(linea);
                linea = tec.readLine();
            }
        } catch (Exception ex) {

        }
    }

}
