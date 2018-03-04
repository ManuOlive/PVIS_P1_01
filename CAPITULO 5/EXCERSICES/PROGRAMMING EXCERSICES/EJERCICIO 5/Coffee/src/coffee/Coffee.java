/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Coffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige la opcion: ");
        System.out.println("(1) American 1.99 \n(2) Espresso 2.50 \n(3) Latte 2.15");
        int opcion = entrada.nextInt();
        float precio = 0;
        int x = 1;
        if (opcion == 1) {
            precio = (float) (precio + 1.99);
            System.out.println("El precio es: " + precio);
        }
        if (opcion == 2) {
            precio = (float) (precio + 2.50);
            System.out.println("El precio es: " + precio);
        }
        if (opcion == 3) {
            precio = (float) (precio + 2.15);
            System.out.println("El precio es: " + precio);
        }
        if(opcion==0){
            System.out.println("Gracias por su compra");
        }
    }

}
