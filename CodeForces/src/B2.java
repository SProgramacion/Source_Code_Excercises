
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class B2 {

    static List<String> list = new ArrayList<>();
    static int cont = 0, ini = 5;
    static String res = "", num = "";
    static int pos = 201;
    static BigInteger fact = BigInteger.ONE;

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
                pos++;
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
        boolean estado = false;
        //System.out.println("Case: " + ini);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(get(m))) {
                //System.out.println("Mira: " + i);
                cont++;
                res += (i) + " ";
                estado = true;
            } else if ((estado && !list.get(i + 1).equals(get(m))) || (list.get(i).length() > m)) {
                break;
            } else {
                //fact = new BigInteger((size * (size - 1)) + "");
                fact = fact.multiply(new BigInteger(pos + ""));
                //num = new BigInteger(list.get(pos - 1)).multiply(BigInteger.valueOf(pos)).toString();
                list.add(getCount(fact.toString()));
                pos++;
            }
            if (i == (list.size() - 1)) {
                fact = fact.multiply(new BigInteger(pos + ""));
                //num = new BigInteger(list.get(pos - 1)).multiply(BigInteger.valueOf(pos)).toString();
                list.add(getCount(fact.toString()));
                pos++;
                //i--;

                
            }
            ini++;
        }

    }

    public static void factorial() {
        list.add("");
        for (int i = 1; i <= 2000; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
            list.add(getCount(fact.toString()));
        }
        //System.out.println("sdffd");
    }

    public static String getCount(String n) {
        String l = n, r = "";
        int i = l.length() - 1;
        while (l.charAt(i) == '0') {
            r += "0";
            i--;
        }
        return r;
    }
}
