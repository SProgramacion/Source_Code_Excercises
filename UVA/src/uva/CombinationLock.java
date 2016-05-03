package uva;

import java.io.*;

public class CombinationLock {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea = br.readLine();
            String[] ar;
            while (!linea.equals("0 0 0 0")) {
                ar = linea.split(" ");
                System.out.println("" + RetornarGrados(Integer.parseInt(ar[0]), Integer.parseInt(ar[1]), Integer.parseInt(ar[2]), Integer.parseInt(ar[3])));
                linea = br.readLine();
            }
        } catch (Exception ex) {
        }
    }

    public static int RetornarGrados(int pos, int uno, int dos, int tres) {
        int grados = 120;
        if (pos != uno || uno != dos | uno != tres) {
            grados += uno < pos ? (pos - uno) : (40 - uno + pos);
            grados += dos > uno ? (dos - uno) : (40 - uno + dos);
            grados += tres < dos ? (dos - tres) : (40 - tres + dos);
        }
        return (grados * 9);
    }
}
