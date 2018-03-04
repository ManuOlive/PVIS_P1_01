/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero para sacar el factorial");
        int factorial=entrada.nextInt();
        int contador = 1;
        for(int i=factorial;i>0;i--){
            contador = contador *i;
            System.out.println(contador);
        }
    }
    
}
