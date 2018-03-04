/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un entero: ");
        int num = entrada.nextInt();
        if (num%2==0){
            System.out.println("El numero"+" "+num+" es par");
        }
        System.out.println("El numero"+" "+num+" es impar");
    }
    
}
