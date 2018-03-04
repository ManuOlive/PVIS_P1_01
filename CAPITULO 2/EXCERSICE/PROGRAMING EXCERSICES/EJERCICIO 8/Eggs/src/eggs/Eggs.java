/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float docena;
        float total;
        System.out.println("Cuantos huevos va a quiere: ");
        int huevo = entrada.nextInt();
        if (huevo >= 12) {
            if (huevo % 12 == 0) {
                docena = huevo / 12;
                System.out.println("Cantidas de docenas: " + docena + " a $3.25 por docena");
                total = (float) (docena * 3.25);
                System.out.println("El precio total es: " + total);
            }else{
                int docena2=Math.abs(huevo/12);
                float x =(float)huevo/2;
                float y =x-12;
                float z=y*2;
                System.out.println("Cantidad de docenas: "+docena2+" a 3.25 por docena"+
                        " Cantidad de huevos sueltos: "+z +" a $0.45");
                float total2=(float) ((docena2*3.25)+(z*0.45));
                System.out.println("El total es: "+total2);
            }
        } else {
            System.out.println("Cantidad de huevos: " + huevo + " a $0.45 por pieza");
            total = (float) (huevo * 0.45);
            System.out.println("El precio total es: " + total);
        }
    }

}
