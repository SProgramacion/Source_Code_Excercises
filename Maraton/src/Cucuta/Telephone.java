import java.io.*;

public class Telephone {

    public static void main(String args[]) {
        try {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            String cad;
            int i;

            String res = "";
            String valor;
            cad = bufEntrada.readLine();
            while (!cad.equals("")) {
                for (i = 0; i < cad.length(); i++) {
                    valor = cad.substring(i, i + 1);
                    if (valor.equals("A") || valor.equals("B") || valor.equals("C")) {
                        res = res.concat("2");
                    } else {
                        if (valor.equals("D") || valor.equals("E") || valor.equals("F")) {
                            res = res.concat("3");
                        } else {
                            if (valor.equals("G") || valor.equals("H") || valor.equals("I")) {
                                res = res.concat("4");
                            } else {
                                if (valor.equals("J") || valor.equals("K") || valor.equals("L")) {
                                    res = res.concat("5");
                                } else {
                                    if (valor.equals("M") || valor.equals("N") || valor.equals("O")) {
                                        res = res.concat("6");
                                    } else {
                                        if (valor.equals("P") || valor.equals("Q") || valor.equals("R") || valor.equals("S")) {
                                            res = res.concat("7");
                                        } else {
                                            if (valor.equals("T") || valor.equals("U") || valor.equals("V")) {
                                                res = res.concat("8");
                                            } else {
                                                if (valor.equals("W") || valor.equals("X") || valor.equals("Y") || valor.equals("Z")) {
                                                    res = res.concat("9");
                                                } else {
                                                    res = res.concat(valor);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println(res);
                res = "";
                cad = bufEntrada.readLine();
            }
        } catch (Exception ex) {
        }
    }
}
