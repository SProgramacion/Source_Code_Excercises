
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class root {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            BigInteger num;
            for (int i = 0; i < N; i++) {
                num = new BigInteger(br.readLine());
                System.out.println(raiz2(num));
            }
        } catch (Exception ex) {
        }
    }

    static BigInteger raiz2(BigInteger x) {
        BigInteger r = x;
        BigInteger t = BigInteger.ZERO;
        while (t.compareTo(r) != 0) {
            t = r;
            r = ((x.divide(r)).add(r)).divide(BigInteger.valueOf(2));
        }
        return r;
    }
}
