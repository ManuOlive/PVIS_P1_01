/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countmatches;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class CountMatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String carac1 = "";
        String carac2 = "";
        char a;
        char b;
        int i, j;
        System.out.println("Ingresa una palabra: ");
        carac1=entrada.nextLine();
        System.out.println("Ingresa otra palabra: ");
        carac2=entrada.nextLine();
        for(i=0;i<carac1.length();i++){
            a=carac1.charAt(i);
            //System.out.println(a);
            for(j=0;j<carac2.length();j++){
                b=carac2.charAt(j);
                //System.out.println(b);
                if(a==b){
                    System.out.println("Las letras que se repiten en la palabra son : "+a+" "+b);
                }
            }
        }
    }
}
