
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            int a, b, c;
            while ((linea = br.readLine()) != null) {
                a = Integer.parseInt(linea.split(" ")[0]);
                b = Integer.parseInt(linea.split(" ")[1]);
                c = Integer.parseInt(linea.split(" ")[2]);
                System.out.println(get(a, b, c));
            }
        } catch (Exception ex) {
        }
    }

    public static String get(int a, int b, int c) {
        boolean state = true;
        if (c >= a || c >= b) {
            if (a == c || b == c) {
                return "Yes";
            }
            int r = 0;
            while ((r + a) <= c) {
                r += a;
                if (getModulo(c - r, b) == 0) {
                    return "Yes";
                }
            }
            r = 0;
            while ((r + b) <= c) {
                r += b;
                if (getModulo(c - r, a) == 0) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static int getModulo(int t, int n) {
        return (t % n);
    }
}
