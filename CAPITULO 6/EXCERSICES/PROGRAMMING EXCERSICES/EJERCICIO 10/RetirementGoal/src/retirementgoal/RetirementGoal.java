/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementgoal;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class RetirementGoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("La jubilacion es a los 80 años");
        System.out.println("Ingrese la edad que tiene: ");
        int edad = entrada.nextInt();
        int resta = 80-edad;
        System.out.println("Le faltan "+resta+" años para jubilarse");
        System.out.println("Ingrese la cantidad de dinero ganado al año: ");
        int dinero = entrada.nextInt();
        int contador=0;
        int res=dinero*resta;
        for(int i=edad;i<=80;i++){
            contador=contador+dinero;
        }
        System.out.println("La cantidad de dinero que puede ganar hasta su jubilacion es: "+res);
    }
    
}
