package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeForces {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String total, sub;
            int cont = 0;
            total = br.readLine();
            sub = br.readLine();
            boolean estado = true;
            int h;
            while (estado) {
                h = total.indexOf(sub);
                if (h != -1) {
                    cont++;
                    total = total.substring(h + (sub.length()), total.length());
                } else {
                    estado = false;
                }
            }
            System.out.println(cont);
        } catch (Exception ex) {

        }
    }
}
