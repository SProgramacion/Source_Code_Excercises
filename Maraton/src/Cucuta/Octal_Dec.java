package Cucuta;

import java.util.Scanner;

public class Octal_Dec {

    public static void main(String[] args) {
        
        StringBuilder f = new StringBuilder("123");
        for (int i = 0; i < f.length(); i++) {
            f.append('3');
        }
        System.out.println(f);
        Scanner tec = new Scanner(System.in);
        int octal = tec.nextInt();
        int tam;
        String num = octal + "";
        tam = num.length();
        double decimal = 0, res;
        if (octal != 0) {
            for (int i = 0; i < tam; i++) {
                res = Double.parseDouble(num.substring(i, i + 1));
                decimal += res * Math.pow(8, (tam - i - 1));
            }
        }
        System.out.println("Resultado: " + decimal);
    }
}