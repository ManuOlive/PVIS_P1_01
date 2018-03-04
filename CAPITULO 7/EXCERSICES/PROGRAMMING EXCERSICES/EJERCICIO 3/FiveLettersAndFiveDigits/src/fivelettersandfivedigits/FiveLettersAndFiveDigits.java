/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivelettersandfivedigits;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class FiveLettersAndFiveDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String carac = "";
        System.out.println("Ingresa un caracteres: ");
        carac=entrada.nextLine();
        if(carac.length()<5){
            System.out.println("No ingreso 5 caracteres");
        }
        System.out.println("Ingreso mas de 5 caracteres");
    }
    
}
