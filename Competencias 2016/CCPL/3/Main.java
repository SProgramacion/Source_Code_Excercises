/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccpl;

import java.io.*;
import java.math.BigDecimal.*; // No supe implementarlo ;_;
    /*
 * @author Harp Singer/Run.EXE
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader W = new BufferedReader(new InputStreamReader(System.in)); //Buffer para almacenar datos
        //Pediremos el nÃºmero al cual queremos calcular su raiz cuadrada
        System.out.println(8);
        java.math.BigDecimal num = new java.math.BigDecimal(8);
//                  double num=8; //una variable que se desea leer
        //Pediremos que ingrese el grado de la raiz
        System.out.println(3);
        java.math.BigDecimal coef = new java.math.BigDecimal(3);
//                  double coef=3; //"leer coeficiente"
//                    if (coef==2)
        {
//                   double raiz = Math.sqrt(num); //cÃ¡lculo de raiz cuadrada
//                    System.out.println("La raÃ­z cuadrada del nÃºmero es: " +raiz);
        }
//                             else
//                    { //acÃ¡ anotamos el mÃ©todo para una raÃ­z enÃ©sima (y acÃ¡ tengo el problema :c)

                            //double raiz0 = Math.pow(num, 1/coef);
        //java.math.BigDecimal raiz0 =  java.math.pow(num, 1/coef);;
        java.math.BigDecimal raiz0 = num.pow(1 / 3);
        System.out.println("La raiz del nÃºmero es: " + raiz0);

        double unCentavo = 0.01;
        double suma = unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo;
        System.out.println(suma);
        java.math.BigDecimal unCentavo1 = new java.math.BigDecimal("0.01");
        java.math.BigDecimal suma1 = unCentavo1.add(unCentavo1).add(unCentavo1).add(unCentavo1).add(unCentavo1).add(unCentavo1);
        System.out.println(suma1);
//                    }
    }
}
