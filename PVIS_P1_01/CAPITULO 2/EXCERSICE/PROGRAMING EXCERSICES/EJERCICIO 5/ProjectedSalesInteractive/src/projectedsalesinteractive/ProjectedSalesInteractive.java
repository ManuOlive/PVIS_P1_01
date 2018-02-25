/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsalesinteractive;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class ProjectedSalesInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ventas de este año en la division norte: ");
        int norte=entrada.nextInt();
        System.out.println("Ventas de este año en la division sur: ");
        int sur = entrada.nextInt();
        double ventanorte=norte*0.1;
        double ventasur=sur*0.1;
        double totalnorte=ventanorte+norte;
        double totalsur=ventasur+sur;
        System.out.println("El valor de de la division norte aumentara un 10% de 4000 a: " + totalnorte);
        System.out.println("El valor de de la division sur aumentara un 10% de 5500 a: " + totalsur);
    }
    
}
