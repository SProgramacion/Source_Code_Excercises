package uva;

import java.io.*;

public class OneTwoThree {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), n, res = 0;
            String cad;
            for (int i = 0; i < t; i++) {
                cad = tec.readLine();
                if (cad.length() == 5) {
                    System.out.println("3");
                } else if (getCount("one", cad) == 2) {
                    System.out.println("1");
                } else if (getCount("two", cad) == 2) {
                    System.out.println("2");
                }
            }
        } catch (Exception ex) {
        }
    }

    public static int getCount(String word, String cad) {
        int cont = 0;
        for (int i = 0; i < word.length(); i++) {
            cont += (cad.charAt(i) == word.charAt(i)) ? 1 : 0;
        }
        return cont;
    }
}
