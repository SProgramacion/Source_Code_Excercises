/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cucuta;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 *
 * @author Usuario TI
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mostrar = 0;
        Calendar calendario = new GregorianCalendar();
            int a = calendario.get(Calendar.YEAR);
            int b = calendario.get(Calendar.MONTH) + 1;
            int c = calendario.get(Calendar.DAY_OF_MONTH);
            
            JLabel
            
            GregorianCalendar cale = new GregorianCalendar();
            Jcalendarcombo cal = new Jcalendarcombo();
            int d = cale.getCalendar().getWeekYear();  //Año
            // int e= cale.getDate().getDate();
            int f = cale.getDate().getMonth() + 1; //Mes

            int di = cale.getDate().getDate();//Dia Del MEs

            if (a > d) {
                mostrar = a - d;
            } else {

                if (f > c) {

                    mostrar = 0;
                }

            }

            txtEdad.setText("" + mostrar);
        }
    }
    
}
