import java.math.BigInteger;
import java.util.Scanner;

public class JustTheFacts {

    public static void main(String[] args) {
        try {
            Scanner key = new Scanner(System.in);
            int N;
            String h = "";
            BigInteger result;
            while (true) {
                N = key.nextInt();
                for (int i = 0; i < 5 - String.valueOf(N).length(); i++) {
                    h += " ";
                }
                h += N;
                System.out.println(h +" -> " + Calcular(Factorial(N)));
                h = "";
            }
        } catch (Exception ex) {
        }
    }

    public static BigInteger Factorial(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            f = f.multiply(new BigInteger(i + ""));
        }
        return f;
    }

    public static String Calcular(BigInteger n) {
        StringBuilder cad = new StringBuilder("" + n).reverse();
        String res = "";
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) != '0') {
                res = "" + cad.charAt(i);
                break;
            }
        }
        return res;
    }
}