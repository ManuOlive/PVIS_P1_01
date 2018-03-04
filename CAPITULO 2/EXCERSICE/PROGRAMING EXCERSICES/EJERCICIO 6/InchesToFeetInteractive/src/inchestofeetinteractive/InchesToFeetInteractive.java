/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeetinteractive;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class InchesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese las pulgadas: ");
        int pulgadas=entrada.nextInt();
        double total=pulgadas*0.0833333;
        System.out.println("Pulgadas: "+pulgadas+"\nPies: "+total);
    }
    
}
