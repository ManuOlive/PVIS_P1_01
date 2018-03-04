/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenentryloop;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class EvenEntryLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println("Felicidades");
            for (int i = num; i < 999; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num; i < 999; i++) {
                System.out.println(i);
            }
        }

    }
}
