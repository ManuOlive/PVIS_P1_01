/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createpurchase;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class CreatePurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ticket");
        System.out.println("Cual es el costo: ");
        double costo=entrada.nextInt();
        double iva=costo*0.05;
        int ticket=((int) (Math.random()*20) +""+(int) (Math.random()*20));
        System.out.println("Costo: "+costo);
        System.out.println("Impuesto 5%: "+iva);
        System.out.println(ticket);
        
    }
    
}
