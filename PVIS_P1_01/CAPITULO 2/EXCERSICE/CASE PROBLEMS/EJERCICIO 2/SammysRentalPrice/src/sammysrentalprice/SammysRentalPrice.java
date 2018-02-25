/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammysrentalprice;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class SammysRentalPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("    S\tSAMMY’S MAKES IT IN THE SUN. S");
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ingresa las horas rentadas: ($40 por hora)");
        int horas = entrada.nextInt();
        int total=(horas*40);
        System.out.println("Fueron: "+horas+" horas. El precio es: "+total);
    }
    
}
