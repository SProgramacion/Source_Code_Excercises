/* Este codigo ha sido generado por el modulo psexport 20150822-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CALCULAR.java."

import java.io.*;

public class prueba_java {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int h;
		int i;
		int j;
		int l;
		int n;
		int t;
		int w;
		int w_aux=0;
		t = Integer.parseInt(bufEntrada.readLine());
		h = 0;
		l = 0;
		for (j=1;j<=t;j++) {
			n = Integer.parseInt(bufEntrada.readLine());
			for (i=1;i<=n;i++) {
				w = Integer.parseInt(bufEntrada.readLine());
				if (i!=1) {
					if (w>w_aux) {
						h = h+1;
					} else {
						if (w<w_aux) {
							l = l+1;
						}
					}
				}
				w_aux = w;
			}
			System.out.println("Case "+j+": "+h+" "+l);
			h = 0;
			l = 0;
		}
	}


}

