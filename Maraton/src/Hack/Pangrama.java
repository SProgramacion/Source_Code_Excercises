package Hack;

import java.util.Scanner;

public class Pangrama {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            String linea = tec.nextLine();
            String abc = "abcdefghijklmnopqrstuvwxyz";
            int cont = 0;
            boolean estado = true;

            while (linea.length() >= 1 && linea.length() <= 1000) {
                for (int i = 0; i < abc.length(); i++) {
                    if (linea.toLowerCase().contains(abc.substring(i, i + 1))) {
                        cont++;
                    }
                }
                System.out.println((cont >= abc.length()) ? "pangram" : "not pangram");
                cont = 0;
                linea = tec.nextLine();
            }
        } catch (Exception ex) {
        }
    }
}
