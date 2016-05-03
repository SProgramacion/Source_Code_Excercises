



package ccpl;

import java.io.*;
import java.util.ArrayList;

public class NewMain {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line, nums;
            String[] ar;
            int ini, fin;
            while ((line = br.readLine()) != null) {
                nums = br.readLine();
                ar = nums.split(" ");
                ini = Integer.parseInt(ar[0]);
                fin = Integer.parseInt(ar[1]);
                for (int i = ini; i <= fin; i++) {
                    System.out.println(getCount(line, i));
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getCount(String linea, int tam) {
        boolean estado = true;
        String res = "", test, nuevo = "";
        int ini = 0, fin, pos;
        while (estado) {
            nuevo = linea.substring(ini, linea.length());
            if(nuevo.startsWith(" ")){
                nuevo = nuevo.substring(1, nuevo.length());
            }
            if (nuevo.length() >= tam) {
                pos = ini + tam;
                test = nuevo.substring(tam - 1, tam);
                if (test.equals(" ") || linea.substring(pos, pos + 1).equals(" ")) {
                    //res += test.replaceAll(" ", ".") + "\n";
                    ini += tam;
                    res += nuevo.substring(0, nuevo.indexOf(" ")) + ".";
                } else {
                    for (int i = pos - 1; i >= pos - tam; i--) {
                        String h = linea.substring(i, i + 1);
                        if (h.equals(" ")) {
                            ini = i+1;
                            res += nuevo.substring(0, nuevo.indexOf(" ")) + ".";
                            break;
                        }
                    }
                }

            } else {
                int f = nuevo.indexOf(" ");
                if (f == -1) {
                    res += nuevo;
                } else {
                    res += nuevo.substring(0, f);
                }
                estado = false;
            }
        }
        return res.length();
    }
}
