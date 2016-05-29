
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sudoku {

    static int array[];

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner tec = new Scanner(System.in);
            int N = 0, T, raiz;
            String a = "";
            T = tec.nextInt();

            int m[][];
            int row = 0, cell = 0, cont = 0;
            boolean state = true;
            int j, k;
            int suma, c = 0, aux = 0, pos = 0;

            for (int i = 0; i < T; i++) {
                state = true;
                a = "";
                N = tec.nextInt();

                if (N == 1) {
                    System.out.println("yes");
                } else {
                    aux = 0;
                    c = 0;

                    m = new int[N][N];
                    suma = (N * (N + 1)) / 2;
                    for (j = 0; j < N; j++) {
                        for (k = 0; k < N; k++) {
                            m[j][k] = tec.nextInt();

                            c += m[j][k];
                        }
                        if (c == suma) {
                            c = 0;
                            aux++;
                        }
                    }
                    if (aux == N && state) {

                        if (getCount(m, suma)) {

                            raiz = (int) Math.sqrt((double) N);
                            String res = "";
                            row = cell = cont = 0;
                            for (j = 0; j < raiz; j++) {
                                array = new int[N];
                                pos = 0;
                                if (state) {
                                    for (k = row; k < row + raiz; k++) {
                                        for (int l = cell; l < cell + raiz; l++) {
                                            int h = m[k][l];

                                            if (isFound(h)) {
                                                k = l = raiz;
                                                state = false;
                                            } else {
                                                array[pos] = h;
                                                res += h;
                                                pos++;
                                                cont++;
                                                if (cont == (N * N)) {
                                                    state = false;
                                                }
                                            }
                                        }
                                    }
                                    if ((j + 1) % raiz == 0 && j != 0 && state) {
                                        row += raiz;
                                        cell = 0;
                                        j = -1;
                                    } else {
                                        cell = (j + 1) * raiz;
                                    }
                                    res = "";
                                } else {
                                    break;
                                }
                            }
                            System.out.println(cont == (N * N) ? "yes" : "no");
                        } else {
                            System.out.println("no");
                        }
                    } else {
                        System.out.println("no");

                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public static boolean isFound(int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean getCount(int m[][], int suma) {
        int tam = m.length, cont = 0, aux = 0;

        for (int j = 0; j < tam; j++) {
            for (int i = 0; i < tam; i++) {
                cont += m[i][j];
            }
            if (cont == suma) {
                aux++;
                cont = 0;
            } else {
                j = tam;
                break;
            }
        }
        return aux == tam;
    }

}
