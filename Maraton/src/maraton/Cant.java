package maraton;

import javax.swing.JOptionPane;

public class Cant {

    public static void main(String[] args) {
        int actual = 200000, cant, c50, c20, c10;
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a retirar: "));

        if (cant <= actual && (cant % 10000) == 0) {
            c50 = (cant / 50000);
            c20 = (cant -= (c50 * 50000)) / 20000;
            c10 = (cant -= (c20 * 20000)) / 10000;
            System.out.println("50: " + (c50) + " - 20: " + c20 + " - 10: " + c10);
        }
    }
}
