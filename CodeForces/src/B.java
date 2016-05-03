
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class B {

    static List<String> list = new ArrayList<>();
    static int cont = 0;
    static String res = "";

    public static void main(String[] args) {
        try {
            BigInteger[] ar = new BigInteger[10];

            factorial();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            int m;
            while ((linea = br.readLine()) != null) {
                m = Integer.parseInt(linea);
                getC(m);
                if (cont > 0) {
                    System.out.println(cont);
                    System.out.println(res);
                } else {
                    System.out.println(cont);
                }
            }
        } catch (Exception ex) {
        }
    }

    public static String get(int m) {
        String h = "";
        for (int i = 0; i < m; i++) {
            h += "0";
        }
        return h;
    }

    public static void getC(int m) {
        res = "";
        cont = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(get(m))) {
                cont++;
                res += i + " ";
            }
        }
    }

    public static void factorial() {
        BigInteger fact = BigInteger.ONE;
        list.add("");
        for (int i = 1; i <= 2000; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
            list.add(getCount(fact));
        }
    }

    public static String getCount(BigInteger n) {
        String l = n.toString(), r = "";
        int i = l.length() - 1;
        while (l.charAt(i) == '0') {
            r += "0";
            i--;
        }
        return r;
    }
}
