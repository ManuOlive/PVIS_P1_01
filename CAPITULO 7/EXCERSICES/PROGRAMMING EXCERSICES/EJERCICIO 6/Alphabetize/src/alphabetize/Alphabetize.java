/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetize;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Alphabetize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String carac1 = "";
        char a;
        String carac2 = "";
        char b;
        String carac3 = "";
        char c;
        char inicio='A';
        System.out.println("Ingrese una palabra: ");
        carac1=entrada.nextLine();
        a=carac1.charAt(0);
        if(inicio==a){
            System.out.println("Esta palabra inicia con A");
        }else{
            System.out.println("Esta palabra no empieza con A");
        }
        System.out.println("Ingrese una palabra: ");
        carac2=entrada.nextLine();
        b=carac2.charAt(0);
        if(inicio==b){
            System.out.println("Esta palabra inicia con A");
        }else{
            System.out.println("Esta palabra no empieza con A");
        }
        System.out.println("Ingrese una palabra: ");
        carac3=entrada.nextLine();
        c=carac3.charAt(0);
        if(inicio==c){
            System.out.println("Esta palabra inicia con A");
        }else{
            System.out.println("Esta palabra no empieza con A");
        }
    }
    
}
