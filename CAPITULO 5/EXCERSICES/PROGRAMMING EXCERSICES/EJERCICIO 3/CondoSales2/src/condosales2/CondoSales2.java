/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales2;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class CondoSales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo de casq que quiera: ");
        System.out.println("1) Vista al parque");
        System.out.println("2) Cancha de golf");
        System.out.println("3) Vista al lago");
        int elegir = entrada.nextInt();
        int elegir2;
        if(elegir==1){
            System.out.println("El precio es: $150,000");
            System.out.println("¿Lo quiere con garage?");
            System.out.println("1)Si/2)No");
            elegir2 = entrada.nextInt();
            if(elegir2==1){
                System.out.println("Costo extra: $5000");
            }
            if(elegir2==2){
                System.out.println("Gracias por su compra");
            }
        }
        if(elegir==2){
            System.out.println("El precio es: $170,000");
            System.out.println("1)Si/2)No");
            elegir2 = entrada.nextInt();
            if(elegir2==1){
                System.out.println("Costo extra: $5000");
            }
            if(elegir2==2){
                System.out.println("Gracias por su compra");
            }
        }
        if(elegir==3){
            System.out.println("El precio es: $210,000");
            System.out.println("1)Si/2)No");
            elegir2 = entrada.nextInt();
            if(elegir2==1){
                System.out.println("Costo extra: $5000");
            }
            if(elegir2==2){
                System.out.println("Gracias por su compra");
            }
        }
    }
    
}
