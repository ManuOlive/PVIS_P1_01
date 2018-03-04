/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peso;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa los pesos a convertir en centavos: ");
        int centavos=entrada.nextInt();
        int total=centavos*100;
        System.out.println("Los centavos son: "+total);
    }
    
}
