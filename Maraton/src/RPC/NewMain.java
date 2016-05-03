/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPC;

import java.math.BigInteger;

/**
 *
 * @author Usuario TI
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(CalcularCombinacion(4, 2));
    }
    public static BigInteger CalcularCombinacion(int a, int b) {
        return Factorial(a).divide(Factorial(a - b).multiply(Factorial(b)));
    }

    public static BigInteger Factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(Factorial(n - 1));
        }
    }
    
}
