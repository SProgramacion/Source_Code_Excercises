
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class dividing {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(getDecimal(line).mod(BigInteger.valueOf(17)).compareTo(BigInteger.ZERO) == 0 ? "yes" : "no");
            }
        } catch (Exception ex) {

        }
    }

    public static BigInteger getDecimal(String hex) {
        BigInteger result = BigInteger.ZERO;
        char car;
        long value;
        int cont = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            car = hex.charAt(i);
            value = car == 'A' ? 10 : car == 'B' ? 11 : car == 'C' ? 12 : car == 'D' ? 13 : car == 'E' ? 14 : car == 'F' ? 15 : Long.parseLong("" + car);
            result = result.add(BigInteger.valueOf(value).multiply(BigInteger.valueOf(16).pow(cont)));
            cont++;
        }
        return result;
    }

}
