
import java.io.*;

public class book {

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
        }
    }

    public static int getCount(String linea, int tam) {
        boolean estado = true;
        String res = "", test, nuevo = linea;
        while (estado) {
            nuevo = nuevo.substring(0, nuevo.length());
            if (nuevo.startsWith(" ")) {
                nuevo = nuevo.substring(1, nuevo.length());
            }
            if (nuevo.length() >= tam) {
                test = nuevo.substring(tam - 1, tam);
                if (test.equals(" ") || nuevo.substring(tam, tam + 1).equals(" ")) {
                    res += nuevo.substring(0, nuevo.indexOf(" ")) + ".";
                    nuevo = nuevo.substring(tam);
                } else {
                    for (int i = tam - 1; i >= 0; i--) {
                        String h = nuevo.substring(i, i + 1);
                        if (h.equals(" ")) {
                            res += nuevo.substring(0, nuevo.indexOf(" ")) + ".";
                            nuevo = nuevo.substring(i);
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

