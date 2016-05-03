package Hack;

import java.util.Scanner;

public class Lonely {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            int N = Integer.parseInt(tec.nextLine());
            String[] ar;
            String ent;
            while (N > 0 && N <= 100) {
                ent = tec.nextLine();
                if (N == 1) {
                    System.out.println(ent);
                } else {
                    ar = ent.split(" ");
                    for (int i = 0; i < N; i++) {
                        if (Calcular(ar, Integer.parseInt(ar[i])) == 1) {
                            System.out.println(ar[i]);
                            break;
                        }
                    }
                }
                N = Integer.parseInt(tec.nextLine());
            }
        } catch (Exception ex) {
        }
    }

    public static int Calcular(String[] ar, int n) {
        int res = 0;
        for (int i = 0; i < ar.length; i++) {
            if (n == Integer.parseInt(ar[i])) {
                res++;
            }
        }
        return res;
    }
}