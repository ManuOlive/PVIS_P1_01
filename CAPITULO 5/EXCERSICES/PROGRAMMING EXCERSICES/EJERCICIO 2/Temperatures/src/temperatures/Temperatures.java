/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la temperatura: ");
        int temp = entrada.nextInt();
        if(temp>=90){
            System.out.println("Calor peligroso");
        }
        if(temp<=32){
            System.out.println("Frio peligroso");
        } 
        if(temp>32&&temp<90){
            System.out.println("Temperatura normal");
        }
    }
    
}
