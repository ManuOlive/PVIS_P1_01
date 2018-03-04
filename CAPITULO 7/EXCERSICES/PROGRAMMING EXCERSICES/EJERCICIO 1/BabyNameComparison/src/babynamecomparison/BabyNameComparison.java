/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynamecomparison;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre1="";
        String nombre2 =" ";
        String nombres = "";
        System.out.println("Ingrese el primer nombre: ");
        nombre1=entrada.nextLine();
        System.out.println("Ingrese el segundo nombre:");
        nombre2= entrada.nextLine();
        nombres=nombre1+nombre2;
        System.out.println("Posible nombre: "+nombres);
    }
    
}
