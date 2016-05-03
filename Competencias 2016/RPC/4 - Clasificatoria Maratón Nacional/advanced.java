
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class advanced {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            BigInteger N;
            while (!(line = br.readLine()).equals("0")) {
                N = new BigInteger(line);
                N = N.multiply(N.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
                N = N.multiply(N);
                System.out.println(get(N));
            }
        } catch (Exception ex) {
        }
    }

    public static long get(BigInteger N) {
        String g = N.toString();
        String res = g.length() > 10 ? g.substring(g.length() - 10, g.length()) : g;
        return Long.parseLong(res);
    }

}
