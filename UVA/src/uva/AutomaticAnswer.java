package uva;

import java.io.*;

public class AutomaticAnswer {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), n, res = 0;
            String cad;
            for (int i = 0; i < t; i++) {
                n = Integer.parseInt(tec.readLine());
                res = (n * 567);
                res /= 9;
                res += 7492;
                res *= 235;
                res /= 47;
                res -= 498;
                cad = String.valueOf(res);
                System.out.println(cad.substring(cad.length() - 2, cad.length() - 1));
            }
        } catch (Exception ex) {
        }
    }
}
