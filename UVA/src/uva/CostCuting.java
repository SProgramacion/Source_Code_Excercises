package uva;

import java.io.*;
import java.util.Arrays;

public class CostCuting {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), res;
            String linea, n;
            String[] ar;
            int[] array;
            for (int i = 0; i < t; i++) {
                linea = tec.readLine();
                ar = linea.split(" ");
                array = new int[ar.length];

                for (int j = 0; j < ar.length; j++) {
                    array[j] = Integer.parseInt(ar[j]);
                }
                Arrays.sort(array);
                System.out.println("Case " + (i + 1) + ": " + array[1]);
            }
        } catch (Exception ex) {
        }
    }

}
