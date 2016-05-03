package Cucuta;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Barreneche {

    public static void main(String[] args) {
        int opc, num, factor;
        String menu = "Bienvenido. Qué desea hacer?\n1. Mostrar nombre.\n2. Verificar si un número es factor de otro";
        String nombre, apellido;
        
        ImageIcon img = new ImageIcon("src//iconos//sss.png");
        JLabel Imagenn = new JLabel(img);
        if(img.toString().equals("src//iconos//sss.png")){
            System.out.println("Error");
        }
       
        opc = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nDigite la opción:"));
        switch (opc) {
            case 1:
                nombre = JOptionPane.showInputDialog("Nombre: ");
                apellido = JOptionPane.showInputDialog("Apellido: ");
                JOptionPane.showMessageDialog(null, "Bienvenido " + mostrarNombre(nombre, apellido));
                break;
            case 2:
                num = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
                factor = Integer.parseInt(JOptionPane.showInputDialog("Factor:"));
                if (calcularFactor(num, factor)) {
                    JOptionPane.showMessageDialog(null, num + " es factor de " + factor);
                } else {
                    JOptionPane.showMessageDialog(null, num + " no es factor de " + factor);
                }
                break;
        }

    }

    public static String mostrarNombre(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public static boolean calcularFactor(int num, int factor) {
        if (num % factor == 0) {
            return true;
        } else {
            return false;
        }
    }

}
