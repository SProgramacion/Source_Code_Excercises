package Cucuta;

import java.io.*;

public class Other {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()), picos = 0;
            String linea;
            String[] array;
            int sube = 0, baja = 0;
            boolean sube_inicio = false, sube_fin = false;
            while (N != 0) {
                linea = br.readLine();
                linea += " " + linea.split(" ")[0];
                array = linea.split(" ");
                for (int i = 1; i < array.length; i++) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[i - 1])) {
                        if (i == 1) {
                            sube_inicio = false;
                        }
                        if (i == (array.length - 1)) {
                            sube_fin = false;
                        }
                        baja++;
                        sube = 0;
                        if (baja == 1) {
                            picos++;
                        }
                    } else {
                        if (i == 1) {
                            sube_inicio = true;
                        }
                        if (i == (array.length - 1)) {
                            sube_fin = true;
                        }
                        sube++;
                        baja = 0;
                        if (sube == 1) {
                            picos++;
                        }
                    }
                }
                picos += (sube_inicio != sube_fin) ? 1 : 0;
                System.out.println(picos - 1);
                picos = 0;
                sube = 0;
                baja = 0;
                N = Integer.parseInt(br.readLine());
            }
        } catch (Exception ex) {

        }
    }

}
