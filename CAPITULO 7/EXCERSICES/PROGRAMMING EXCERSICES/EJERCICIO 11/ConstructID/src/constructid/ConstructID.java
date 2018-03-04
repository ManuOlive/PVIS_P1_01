/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructid;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String n1="";
        String n2 ="";
        String num="";
        String id="";
        System.out.println("Ingrese su primer nombre: ");
        n1=entrada.nextLine();
        char a = n1.charAt(0);
        System.out.println("Ingrese su segundo nombre: ");
        n2= entrada.nextLine();
        char b = n2.charAt(0);
        System.out.println("Ingrese el numero de su casa: ");
        num=entrada.nextLine();
        char c = num.charAt(0);
        id=id+a;
        id=id+b;
        id=id+c;
        System.out.println("Su ID es: "+id);
    }
    
}
