import java.math.BigInteger;
import java.util.Scanner;

public class dynamic {

    public static BigInteger modulo = new BigInteger("10").pow(9).add(new BigInteger("7"));
    public static void main(String[] args) {
        try {
            Scanner key = new Scanner(System.in);
            BigInteger N, K, aux, result;
            while (true) {
                N = key.nextBigInteger();
                K = key.nextBigInteger();
                aux = (N.add(K));
                result = Factorial(aux).divide((Factorial(N)).multiply(Factorial(K)));
                result = result.mod(modulo);
                System.out.println(result);
            }
        } catch (Exception ex) {
        }
    }
    
    //    public static BigInteger Factorial(int n) {
//        if (n <= 1) {
//            return (new BigInteger("1"));
//        } else {
//            //Realizo la multiplicacion del numero n!
//            BigInteger fac = new BigInteger(String.valueOf(n));
//            return (fac.multiply(Factorial(n - 1)));
//        }
//    }

    public static BigInteger Factorial(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(1)) == 0 || n.compareTo(BigInteger.valueOf(0)) == 0) {
            return new BigInteger("1");
        } else {
            return n.multiply(Factorial(n.subtract(BigInteger.valueOf(1))));
        }
    }
}