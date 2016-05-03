package vacaciones;

import javax.swing.JOptionPane;

public class Gradiente {

    public static void main(String[] args) {
        try {
            String funcion = JOptionPane.showInputDialog("Función:");
            double tol = 0.001;
            System.out.println("Funcion: " + funcion);

            String[] r = SepararTerminos(funcion);
            String[] f = r[0].split(",");
            String[] op = r[1].split(",");
            String[] vari = ContarVariables(f).split("/");
            String[] variables = vari[1].split(",");
            String[] coef = vari[0].split(",");

            double[] grad = new double[variables.length];

            //Paso 1: Solicitar el vector gradiente
            double h = 1e-10;
            double[] deriv_eval = new double[grad.length];
            JOptionPane.showMessageDialog(null, "Vector gradiente de " + grad.length + " valores.");
            for (int i = 0; i < grad.length; i++) {
                grad[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor " + (i + 1) + ": "));
                deriv_eval[i] = (CalcularFuncion(f, variables, coef, op, variables[i], (grad[i] + h)) - CalcularFuncion(f, variables, coef, op, variables[i], (grad[i]))) / h;
            }

            //Paso 2 y 3: Verificar que las derivadas sean menores que la tolerancia y calcular:
            String[] ar_t = new String[deriv_eval.length];
            if (VerificarPaso2(deriv_eval, tol) < deriv_eval.length) {

                for (int i = 0; i < ar_t.length; i++) {
                    ar_t[i] = grad[i] + " + " + deriv_eval[i] + "t";
                }
                MostrarArreglo(ar_t);
            } else {
                JOptionPane.showMessageDialog(null, "El algoritmo ha terminado");
            }
            
            //Paso 4: Reemplazar en la función original:
            
            System.out.println("Variables: " + ContarVariables(f).split("/")[1]);
            System.out.println("Coef: " + ContarVariables(f).split("/")[0]);
        } catch (Exception ex) {

        }
    }

    public static int VerificarPaso2(double[] ar, double tol) {
        int count = 0;
        double f = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < tol) {
                count++;
            }
        }
        return count;
    }

    public static double CalcularFuncion(String[] terminos, String[] ar, String[] coef, String[] op, String var, double x) {
        double res = 0;
        for (int i = 0; i < ar.length; i++) {
            if (var.equals(ar[i])) {
                res = Operar(coef[i], op[i]) * Calcular(terminos[i], x);
            }
        }
        return res;
    }

    public static double Calcular(String f, double x) {
        double y = 0;
        for (int i = 0; i < f.length(); i++) {
            if (f.substring(i, i + 1).equals("^")) {
                y = Math.pow(x, Double.parseDouble(f.substring(i + 1, i + 2)));
                break;
            } else {
                y = x;
            }
        }
        return y;
    }

    public static double Obtener(String[] f, String[] op) {
        double in = 0;
//        in = Double.parseDouble(f[0]);
        for (int i = 0; i < f.length; i++) {
            in += Operar(f[i], op[i]);
        }
        return in;
    }

    public static double Operar(String coef, String op) {
        coef = (coef.equals("")) ? "1" : coef;
        return (op.equals("+")) ? (Double.parseDouble(coef)) : (-Double.parseDouble(coef));
    }

    public static int Posicion(String[] ar, String var) {
        int pos = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals(var)) {
                pos = i;
            }
        }
        return pos;
    }

    public static void MostrarArreglo(String[] f) {
        for (int i = 0; i < f.length; i++) {
            System.out.println("N" + (i + 1) + ": " + f[i]);
        }
    }

    public static String RetornarVariable(String f) {
        String num = "0123456789";
        int cont = 0;
        String res = "", coef = "";
        for (int i = 0; i < f.length(); i++) {
            if (cont == 0) {
                if (!num.contains(f.substring(i, i + 1))) {
                    cont = 1;
                    res += f.substring(i, i + 1);
                } else {
                    coef += f.substring(i, i + 1);
                }
            } else {
                if (!f.substring(i, i + 1).equals("^")) {
                    res += f.substring(i, i + 1);
                } else {
                    break;
                }
            }
        }
        return coef + "/" + res;
    }

    public static String ContarVariables(String[] funcion) {
        String res = "", coef = "";
        String[] ar;
        for (int i = 0; i < funcion.length; i++) {
            ar = RetornarVariable(funcion[i]).split("/");
            if (!res.contains(ar[1])) {
                res += ar[1] + ",";
                coef += ar[0] + ",";
            }
        }
        return coef + "/" + res;
    }
//-5x1^2+3x2+5x3^2

    public static String[] SepararTerminos(String funcion) {
        String res[] = new String[2];
        res[0] = res[1] = "";
        if (!funcion.startsWith("-")) {
            funcion = "+" + funcion;
        }
        for (int i = 0; i < funcion.length(); i++) {
            if (funcion.substring(i, i + 1).equals("+") || funcion.substring(i, i + 1).equals("-")) {
                if (i != 0) {
                    res[0] += funcion.substring(0, i) + ",";
                }
                res[1] += funcion.substring(i, i + 1) + ",";
                funcion = funcion.substring(i + 1, funcion.length());
                i = 0;
            }
        }
        res[0] += funcion + ",";
        return res;
    }

}
