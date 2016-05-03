
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pyramids {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            int l3, l4, l5;
            while ((linea = br.readLine()) != null) {
                l3 = Integer.parseInt(linea.split(" ")[0]);
                l4 = Integer.parseInt(linea.split(" ")[1]);
                l5 = Integer.parseInt(linea.split(" ")[2]);
                System.out.println((volumenTriangulo(l3) + volumenCuadrado(l4) + volumenPentagono(l5)));
            }
        } catch (Exception ex) {
        }
    }

    public static double volumenTriangulo(int l3) {
        double hb, area, ab, hp;
        hb = Math.sqrt((Math.pow((double) l3, 2) - Math.pow((double) (l3) / (double) (2), 2)));
        area = (l3 * hb) / 2;
        ab = hb / 3;
        hp = Math.sqrt((Math.pow(hb, 2) - Math.pow(ab, 2)));
        return (area * hp) / 3;
        //return 0;
    }

    public static double volumenCuadrado(int l4) {
        double area, h;
        area = l4 * l4;
        h = Math.sqrt((Math.pow((double) (l4 * (Math.sqrt(3)) / 2), 2) - Math.pow((double) (l4) / (double) (2), 2)));
        return (area * h) / 3;
    }

    public static double volumenPentagono(int l5) {
        double r, area, ab, h;
        r = (double) l5 / ((Math.sin(Math.toRadians(36))) * 2);
        ab = Math.sqrt((Math.pow(r, 2) - Math.pow((double) (l5) / (double) (2), 2)));
        h = Math.sqrt((Math.pow((double) l5, 2) - Math.pow(r, 2)));
        area = 5 * l5 * ab / 2;
        return (area * h) / 3;
    }

}
