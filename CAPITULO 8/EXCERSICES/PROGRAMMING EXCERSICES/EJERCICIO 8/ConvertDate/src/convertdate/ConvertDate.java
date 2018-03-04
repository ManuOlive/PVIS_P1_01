/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertdate;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class ConvertDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String fecha="";
        String nuevafecha="";
        System.out.println("Ingrese la fecha(Mes/Dia/Año): ");
        fecha=entrada.nextLine();
        char mes = fecha.charAt(0);
        char dia = fecha.charAt(2);
        if(mes=='1'){
            nuevafecha=fecha.substring(1);
            System.out.println("Enero"+nuevafecha);
        }
        if(mes=='2'){
            nuevafecha=fecha.substring(2);
            System.out.println("Febrero"+nuevafecha);
        }
        if(mes=='3'){
            nuevafecha=fecha.substring(3);
            System.out.println("Marzo"+nuevafecha);
        }
        if(mes=='4'){
            nuevafecha=fecha.substring(4);
            System.out.println("Abril"+nuevafecha);
        }
        if(mes=='5'){
            nuevafecha=fecha.substring(5);
            System.out.println("Mayo"+nuevafecha);
        }
        if(mes=='6'){
            nuevafecha=fecha.substring(6);
            System.out.println("Junio"+nuevafecha);
        }
        if(mes=='7'){
            nuevafecha=fecha.substring(7);
            System.out.println("Julio"+nuevafecha);
        }
        if(mes=='8'){
            nuevafecha=fecha.substring(8);
            System.out.println("Agosto"+nuevafecha);
        }
        if(mes=='9'){
            nuevafecha=fecha.substring(9);
            System.out.println("Septiembre"+nuevafecha);
        }
        /*if(mes=='1'){
            nuevafecha=fecha.substring(1);
            System.out.println("Enero"+nuevafecha);
        }
        if(mes=='1'){
            nuevafecha=fecha.substring(11);
            System.out.println("Noviembre"+nuevafecha);
        }
        if(mes=='1'){
            nuevafecha=fecha.substring(12);
            System.out.println("Diciembre"+nuevafecha);
        }*/
    }
    
}
