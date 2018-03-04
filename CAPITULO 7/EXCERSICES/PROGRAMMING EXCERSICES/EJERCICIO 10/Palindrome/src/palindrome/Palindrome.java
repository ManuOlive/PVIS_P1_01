/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase, frase1 = "";
        System.out.println("Ingrese un nombre");
        frase = entrada.nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            frase1 = frase1 + frase.charAt(i);
        }
        if (frase.equals(frase1)) {
            System.out.println("La palabra es palindroma");
        }

    }
}

}
