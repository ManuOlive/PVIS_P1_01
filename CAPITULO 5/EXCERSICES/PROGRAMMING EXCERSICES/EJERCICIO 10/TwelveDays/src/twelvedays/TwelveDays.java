/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelvedays;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class TwelveDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un dia: ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Una perdiz en un peral");
            case 2:
                System.out.println("Dos tórtolas");
            case 3: 
                System.out.println("Tres gallinas francesas");
            case 4:
                System.out.println("Cuatro pájaros piando");
            case 5:
                System.out.println("Cinco anillos de oro");
            case 6:
                System.out.println("Seis ocas empollando");
            case 7:
                System.out.println("Siete cisnes nadando");
            case 8: 
                System.out.println("Ocho sirvientas ordeñando");
            case 9:
                System.out.println("Nueve damas danzando");
            case 10:
                System.out.println("Diez señores saltando");
            case 11:
                System.out.println("Once gaiteros tocando la gaita");
            case 12:
                System.out.println("Doce tamborileros tocando el tambor");
        }
    }

}
