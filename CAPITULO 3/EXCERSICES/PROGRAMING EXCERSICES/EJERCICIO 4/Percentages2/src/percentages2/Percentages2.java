/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentages2;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Percentages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingresa el primer numero: ");
        double a=entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double b=entrada.nextDouble();
        double total=((a*10)/b);
        System.out.println(a+" es el "+total+"% "+ "de" +b);
        double total2=((b*10)/a);
        System.out.println(b+" es el "+total2+"% "+ "de" +a);
    }
    
}
