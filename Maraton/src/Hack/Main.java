
package Hack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea, N;
            String[] ar;
            while (!"".equals(N = br.readLine())) {
                linea = br.readLine();
                ar = linea.split(" ");
                System.out.println(getCount(ar, N));
            }
        } catch (Exception ex) {
        }
    }
    
    public static int getCount(String[] ar, String N) {
        int res = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equalsIgnoreCase(N)) {
                res++;
            }
        }
        return res;
    }
}
