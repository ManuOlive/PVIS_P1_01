/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countspaces;

/**
 *
 * @author Arturo
 */
public class CountSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "The person who says something is impossible should not interrupt the person who is doing it";
        char espacio;
        for(int i=0;i<frase.length();i++){
            espacio = frase.charAt(i);
            System.out.println(espacio);
            if(espacio.equals(" ")){
                System.out.println(i);
           }
        }
    }
    
}
