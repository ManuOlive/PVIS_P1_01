/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonstratingstringmethods;

/**
 *
 * @author Arturo
 */
public class DemonstratingStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "You can never cross the ocean until you have the courage to lose sight of the shore";
        int a=frase.indexOf('v');
        int b=frase.indexOf('x');
        char c=frase.charAt(16);
        boolean d=frase.endsWith("bus");
        boolean e=frase.endsWith("car");
        String f= frase.replace('c', 'C');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    
}
