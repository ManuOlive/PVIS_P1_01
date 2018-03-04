/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class CountWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra = ""; 
        int contador=0;
        System.out.println("Ingresa una palabra: ");
        palabra=entrada.nextLine();
        for(int i = 0;i<palabra.length();i++){
            contador=contador+1;
        }
        System.out.println("La palabra tiene "+contador+" letras");
    }
    
}
