/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspections;

/**
 *
 * @author Arturo
 */
public class Inspections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fabrica;
        for(int i =0; i<=52;i++){
            fabrica=(int) (1+(Math.random()*4));
            System.out.println("Semana N°"+i+" Inspeccionar fabrica N°"+fabrica);
        }
    }
    
}
