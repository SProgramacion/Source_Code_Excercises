/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacaciones;

import javax.swing.JOptionPane;

public class Variables {

    public static void main(String[] args) {
        String funci = JOptionPane.showInputDialog("Función:");

        int x = Integer.parseInt(JOptionPane.showInputDialog("Valor de la incógnita:"));

        String funcion = Convertir(funci);
        System.out.println("Funcion: " + funcion);

        String[] r = Separar(funcion);

        String[] f = r[0].split(",");

        String[] fun = Calcular(f, x);
        String[] op = r[1].split(",");
        JOptionPane.showMessageDialog(null, "Resultado: " + Obtener(fun, op));
    }


    public static String Convertir(String funcion) {
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String r = "";
        for (int i = 0; i < abc.length; i++) {
            if (funcion.contains(abc[i])) {
                r = funcion.replace(abc[i], "x");
            }
        }
        return r;
    }

    public static String[] Separar(String funcion) {
        String res[] = new String[2];
        res[0] = res[1] = "";
        for (int i = 0; i < funcion.length(); i++) {
            if (funcion.substring(i, i + 1).equals("+") || funcion.substring(i, i + 1).equals("-")) {
                res[0] += funcion.substring(0, i) + ",";
                res[1] += funcion.substring(i, i + 1) + ",";
                funcion = funcion.substring(i + 1, funcion.length());
                i = 0;
            }
        }
        res[0] += funcion + ",";
        return res;
    }

    public static String[] Calcular(String[] f, double x) {
        String[] res = f;
        double y;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length(); j++) {
                if (j < res[i].length() - 1) {
                    if (res[i].substring(j, j + 2).equals("x^")) {
                        y = Double.parseDouble(res[i].substring(0, j)) * Math.pow(x, Double.parseDouble(res[i].substring(j + 2, res[i].length())));
                        res[i] = String.valueOf(y);
                    }
                }
                if (res[i].substring(j, j + 1).equals("x")) {
                    y = Double.parseDouble(res[i].substring(0, j)) * x;
                    res[i] = String.valueOf(y);
                }
            }
        }
        return res;
    }

    public static double Obtener(String[] f, String[] op) {
        double in = 0;
        in = Double.parseDouble(f[0]);
        for (int i = 1; i < f.length; i++) {
            in += Operar(f[i], op[i - 1]);
        }
        return in;
    }

    public static double Operar(String f, String op) {
        double res = 0;
        return res = (op.equals("+")) ? (Double.parseDouble(f)) : (-Double.parseDouble(f));
    }
    
}
