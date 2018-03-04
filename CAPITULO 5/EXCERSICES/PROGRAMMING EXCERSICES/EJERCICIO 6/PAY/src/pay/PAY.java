/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class PAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nivel/Pagos por hora\n1 17.00 \n2 20.00 \n3 22.00");
        System.out.println("Eliga el nivel: ");
        int hora;
        float precio = 0;
        Scanner entrada = new Scanner(System.in);
        int opcion=entrada.nextInt();
        if(opcion==1){
            System.out.println("Ingrese el numero de horas: ");
            hora=entrada.nextInt();
            precio=hora*17;
            System.out.println("El total a pagar es: "+precio);
        }
        if(opcion==2){
            System.out.println("Ingrese el numero de horas: ");
            hora=entrada.nextInt();
            precio=hora*20;
            System.out.println("El total a pagar es: "+precio);
        }
        if(opcion==3){
            System.out.println("Ingrese el numero de horas: ");
            hora=entrada.nextInt();
            precio=hora*22;
            System.out.println("El total a pagar es: "+precio);
        }
    }
    
}
