/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import javax.swing.JOptionPane;

public class F {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Número de la serie"));
        JOptionPane.showMessageDialog(null, "Resultado: " + CalcularFibonacci(n-1));
    }
    public static int CalcularFibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return CalcularFibonacci(n - 1) + CalcularFibonacci(n - 2);
        }
    }
    
}
