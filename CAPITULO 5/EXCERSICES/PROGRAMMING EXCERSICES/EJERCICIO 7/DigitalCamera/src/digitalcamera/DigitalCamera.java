/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalcamera;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class DigitalCamera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿De cuantos megapixeles es la camara?");
        System.out.println("1)6 Megapixeles\n2)Otra");
        int opcion=entrada.nextInt();
        int cantidad;
        if(opcion==1){
            System.out.println("El precio de la camara es $99");
            System.out.println("Ingresa la cantidad: ");
            cantidad=entrada.nextInt();
            System.out.println("El precio es: "+(cantidad*99));
        }
        if(opcion==2){
            System.out.println("El precio de la camara es $129");
            System.out.println("Ingresa la cantidad: ");
            cantidad=entrada.nextInt();
            System.out.println("El precio es: "+(cantidad*129));
        }
    }
    
}
