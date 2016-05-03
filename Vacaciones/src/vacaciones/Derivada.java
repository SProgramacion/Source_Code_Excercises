/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacaciones;

/**
 *
 * @author Usuario TI
 */
public class Derivada {

    public static double f(double x) {
        return (x * x) + 2 * x + 1;
    }

    public static double f2(double x) {
        return 8 * x;
    }

    public static void main(String[] args) {
        double h = (1e-10)*1000000000, x = 3;
//        System.out.println("Resultado: " + ((5 * Math.pow((x + h), 2) + 3 * (x + h)) - (5 * Math.pow((x), 2) + 3 * (x))) / h
//        );
//        System.out.println("Resultado: " + (8 * (x + h) - (8 * x)) / h);
//        
//        System.out.println("H:"+1*Math.pow(10, -10));
//        System.out.println("Resultado: " + (8 * (x + 1000000000*h) - (8 * x)) / (1000000000*h));
//        System.out.println("Resultado: " + (8 * (x + h) - (8 * x)) / (h));
        double d = 1f/4f;
        System.out.println("d: " +d);
    }

}
