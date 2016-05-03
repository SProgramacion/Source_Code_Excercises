package uva;

import java.io.*;
import java.util.Arrays;

public class Parking {

    public static void main(String[] args) {
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(tec.readLine()), res;
            String linea, n;
            String[] ar;
            int[] array;
            for (int i = 0; i < t; i++) {
                n = tec.readLine();
                linea = tec.readLine();
                ar = linea.split(" ");
                array = new int[ar.length];

                for (int j = 0; j < ar.length; j++) {
                    array[j] = Integer.parseInt(ar[j]);
                }
                Arrays.sort(array);
                res = (array[array.length - 1] - array[0]) * 2;
                System.out.println(res);
            }
        } catch (Exception ex) {
        }
    }

}
