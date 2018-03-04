/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeletteracronym;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class ThreeLetterAcronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String carac1 = "";
        String carac2 = "";
        String carac3 = "";
        System.out.println("Ingresa una palabra: ");
        carac1=entrada.nextLine();
        char a=carac1.charAt(0);
        System.out.println("Ingresa otra palabra: ");
        carac2=entrada.nextLine();
        char b=carac2.charAt(0);
        System.out.println("Ingresa otra palabra: ");
        carac3=entrada.nextLine();
        char c=carac3.charAt(0);
        System.out.println("ACRONIMO");
        System.out.println(a+" "+b+" "+c);
    }
    
}
