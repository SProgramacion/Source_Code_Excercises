
import java.util.Scanner;

public class simonsays {

    public static void main(String[] args) {
        try {
            Scanner tec = new Scanner(System.in);
            int N = Integer.parseInt(tec.nextLine());
            String entrada;
            String simon = "Simon says ";
            while (N-- != 0) {
                entrada = tec.nextLine();
                if (entrada.startsWith(simon)) {
                    System.out.println(entrada.substring(10));
                }
            }
        } catch (Exception ex) {
        }
    }
}
