package Cucuta;

import java.util.Scanner;

public class Octal_Hex {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String[] valor = new String[8];
        valor[0] = "000";
        valor[1] = "001";
        valor[2] = "010";
        valor[3] = "011";
        valor[4] = "100";
        valor[5] = "101";
        valor[6] = "110";
        valor[7] = "111";

        int octal = tec.nextInt();
        int cont = 0, mod;
        String num = octal + "", binario = "", fin = "", res = "", res2 = "";
        double n;
        for (int i = 0; i < num.length(); i++) {
            binario += valor[Integer.parseInt(num.substring(i, i + 1))];
        }
        mod = binario.length() % 4;

        if (mod != 0) {
            for (int i = 0; i < 4 - mod; i++) {
                res2 += "0";
            }
        }
        binario = res2 + binario;
        for (int i = 0; i < binario.length(); i++) {
            cont++;
            if (cont <= 4) {
                res += binario.substring(i, i + 1);
            } else if (i == binario.length() - 1) {
                n = Convertir_Hex(res);
                fin += (n == 0) ? "" : (n == 10) ? "A" : (n == 11) ? "B" : (n == 12) ? "C" : (n == 13) ? "D" : (n == 14) ? "E" : (n == 15) ? "F" : n;
                cont = 0;
                res = "";
            } else {
                n = Convertir_Hex(res);
                fin += (n == 0) ? "" : (n == 10) ? "A" : (n == 11) ? "B" : (n == 12) ? "C" : (n == 13) ? "D" : (n == 14) ? "E" : (n == 15) ? "F" : n;
                cont = 0;
                res = "";
                i--;
            }
        }
        System.out.println("Resultado: " + fin);
    }

    public static int Convertir_Hex(String cad) {
        int num;
        int res = 0;
        for (int i = 0; i < cad.length(); i++) {
            num = Integer.parseInt(cad.substring(i, i + 1));
            res += num * Math.pow(2, 3 - i);
        }
        return res;
    }

}
