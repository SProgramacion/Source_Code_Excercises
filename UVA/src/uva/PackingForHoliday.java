package uva;

import java.io.*;

public class PackingForHoliday {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), cont = 0;
            String linea;
            String[] ar;
            for (int i = 0; i < t; i++) {
                linea = tec.readLine();
                ar = linea.split(" ");

                for (int j = 0; j < ar.length; j++) {
                    if (Integer.parseInt(ar[j]) <= 20) {
                        cont++;
                    }else{
                        break;
                    }
                }
                if (cont == 3) {
                    System.out.println("Case " + (i + 1) + ": good");
                } else {
                    System.out.println("Case " + (i + 1) + ": bad");
                }
                cont=0;
            }
        } catch (Exception ex) {
        }
    }
}
