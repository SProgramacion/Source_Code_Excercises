
import java.util.Scanner;

public class queens {

    public static void main(String[] args) {

        try {
            String[] board = new String[8];
            Scanner tec = new Scanner(System.in);
            String linea;
            int r = 0;
            for (int i = 0; i < 8; i++) {
                linea = tec.nextLine();
                board[i] = linea.indexOf("*") + "";
                if (!board[i].equals("-1")) {
                    r++;
                }
            }
            System.out.println((r == 8) ? ((Calcular(board) ? "valid" : "invalid")) : "invalid");
        } catch (Exception ex) {

        }
    }

    public static boolean Calcular(String[] board) {
        boolean estado = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i != j) {
                    if (board[i].equals(board[j]) || Math.abs(Integer.parseInt(board[i]) - Integer.parseInt(board[j])) == Math.abs(i - j)
                            || Math.abs(Integer.parseInt(board[j]) - Integer.parseInt(board[i])) == Math.abs(j - i)) {
                        estado = false;
                        break;
                    }
                }
            }
        }
        return estado;
    }
}
