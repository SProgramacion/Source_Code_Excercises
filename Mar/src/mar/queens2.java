
import java.util.Scanner;

public class queens2 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean cruze = false;
        String[] lecturas = new String[8];
       
        
        int reinas = 0;
        try {
            for (int i = 0; i < lecturas.length; i++) {
                lecturas[i] = tec.nextLine();
            }
            char[][] tablero = new char[8][];
            for (int i = 0; i < tablero.length; i++) {
                tablero[i] = lecturas[i].toCharArray();
            }
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == '*') {
                        reinas++;
                        if (!validar(tablero, i, j)) {
                            cruze = true;
                        }
                    }
                }
            }
            if (!cruze && reinas == 8) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        } catch (Exception e) {

        }
    }

    private static boolean validar(char[][] tablero, int posi, int posj) {
        boolean valido = true;
        for (int i = 0; i < tablero.length && valido; i++) {
            for (int j = 0; j < tablero[i].length && valido; j++) {
                if (tablero[i][j] == '*' && (i != posi || j != posj) && (i - j == posi - posj || i + j == posi + posj || i == posi || j == posj)) {
                    valido = false;
                }
            }
        }
        if (valido) {

        }
        return valido;
    }
}
