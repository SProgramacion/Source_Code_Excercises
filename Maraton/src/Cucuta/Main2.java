package Cucuta;

public class Main2 {

    public static void main(String[] args) {
        try {
            int cont = 11, num = 16;
            boolean estado = false;
            while (num <= 3000) {
                if (cont < 15) {
                    for (int i = 2; i < num / 2; i++) {
                        if (i != num) {
                            if ((i == 2 || i == 3 || i == 5) && (num % i == 0)) {
                                estado = true;
                            }
                            if ((i != 2 && i != 3 && i != 5) && (num % i == 0)) {
                                estado = false;
                                break;
                            }
                        }
                    }
                    cont += estado ? 1 : 0;
                    System.out.println(num);
                } else {
                    break;
                }
                num++;
            }
            System.out.println("The 1500'th ugly number is " + (num - 1));
        } catch (Exception ex) {
        }
    }
}
