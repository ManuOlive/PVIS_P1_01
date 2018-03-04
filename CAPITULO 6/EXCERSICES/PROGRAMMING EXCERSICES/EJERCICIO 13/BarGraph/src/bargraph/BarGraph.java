/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraph;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class BarGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los autos vendidos por Mateo: ");
        int num = entrada.nextInt();
        System.out.println("Ingrese los autos vendidos por Marcos: ");
        int num2= entrada.nextInt();
        System.out.println("Ingrese los autos vendidos por Lucas: ");
        int num3 = entrada.nextInt();
        System.out.println("Ingrese los autos vendidos por Juan: ");
        int num4 = entrada.nextInt();
        String x = "";
        String y = "";
        String z = "";
        String a = "";
        for(int i=0;i<=num;i++){
            x=x+"x";
        }
        for(int i=0;i<=num2;i++){
            y=y+"x";
        }
        for(int i=0;i<=num3;i++){
            z=z+"x";
        }
        for(int i=0;i<=num4;i++){
            a=a+"x";
        }
        System.out.println("Mateo: "+x);
        System.out.println("Marcos: "+y);
        System.out.println("Lucas: "+z);
        System.out.println("Juan: "+a);
    }
    
}
