/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogboarding;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class DogBoarding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double total;
        System.out.println("Ingrese el peso del perro($0.5 por peso): ");
        int peso=entrada.nextInt();
        System.out.println("Ingrese los dias($0.5 por dia): ");
        int dias = entrada.nextInt();
        total=((peso*0.5)+(dias*0.5));
        System.out.println("El total es: "+total);
    }
    
}
