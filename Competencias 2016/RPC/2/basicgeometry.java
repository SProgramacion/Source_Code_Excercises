
import java.io.*;

public class basicgeometry {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
            double A, B, R, h, x, ang, res, aux;
            String linea;
            while ((linea = br.readLine()) != null) {
                A = Double.parseDouble(linea.split(" ")[0]);
                B = Double.parseDouble(linea.split(" ")[1]);
                if (A < B) {
                    aux = A;
                    A = B;
                    B = aux;
                }
                R = (A + B);
                h = R - (B * 2);
                x = Math.sqrt(Math.pow(R, 2) - Math.pow(h, 2));
                ang = (Math.asin(x / R)) * 2;
                res = (R * R * ((ang) - Math.sin(ang))) / 2;
                res -= (Math.PI * B * B);
                String gh = String.format("%.3f", res).replace(",", ".");
                System.out.println(gh);
            }

        } catch (Exception ex) {

        }
    }
}
