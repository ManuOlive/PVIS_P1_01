/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlyseventpric;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class CarlysEventPric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int total;
        System.out.println("    ****************************************************");
        System.out.println("    *\tCarly’s makes the food that makes it a party.  *");
        System.out.println("    ****************************************************");
        System.out.println("Ingrese el numero de invitados($35 por cda invitado): ");
        int invitados=entrada.nextInt();
        if (invitados>=50){
            System.out.println("EVENTO GRANDE");
            total=invitados*35;
            System.out.println("El precio total es de: "+total);
        }
        else {
            System.out.println("EVENTO CHICO");
            total=invitados*35;
            System.out.println("El precio total es de: "+total);
        }
    }
    
}
