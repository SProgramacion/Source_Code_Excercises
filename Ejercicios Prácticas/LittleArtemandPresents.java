package rpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LittleArtemandPresents {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            int N;
            while ((line = br.readLine()) != null) {
                N = Integer.parseInt(line);
                System.out.println(getCount(N));
            }
        } catch (Exception ex) {
        }
    }

    public static int getCount(int cant) {
        int cont;
        int div, res;
        if (cant == 1 || cant == 2) {
            return 1;
        } else {
            div = cant / 3;
            res = div * 2;
            if (div * 3 == cant) {
                cont = res;
            } else {
                cont = ((res + div) + 1 <= cant) || ((res + div) + 2 <= cant) ? res + 1 : res;
            }
        }
        return cont;
    }

}
