import java.math.BigInteger;
import java.util.Scanner;

public class ip {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String c = "11111111111111111111111111111111";
        
        
        System.out.println(Integer.parseInt(c,2));
        int n = tec.nextInt();
        int p = Potencia(n);
        
        c = c.substring(0, c.length() - p) + c.substring(c.length() - p, c.length()).replaceAll("1", "0");
        System.out.println(Separar(c));
    }

    public static int Potencia(int n) {
        double r = (Math.log(n) / Math.log(2));
        return (r % 1 == 0) ? (int) r : (int) (r + 1);
    }

    public static String Separar(String masc) {
        String m = "";
        for (int i = 0; i < masc.length(); i += 8) {
            m += Integer.parseInt(masc.substring(i, i + 8), 2) + ".";
        }
        return m;
    }
}
