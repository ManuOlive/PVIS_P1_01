/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpentrychoice;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class CarpentryChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String opcion = "";
        System.out.println("Objetos disponibles: Mesa, Escritorio, Ropero, Centro de entrentenimiento");
        System.out.println("Selecciona una opcion: ");
        opcion=entrada.nextLine();
        if(opcion=="Mesa"){
            System.out.println("Precio: $250");
        }
        if(opcion=="Escritorio"){
            System.out.println("Precio: $350");
        }
        if(opcion=="Ropero"){
            System.out.println("Precio: 450");
        }
        if(opcion=="Centro de entretenimioento"){
            System.out.println("Precio: $1250");
        }
    }
    
}
