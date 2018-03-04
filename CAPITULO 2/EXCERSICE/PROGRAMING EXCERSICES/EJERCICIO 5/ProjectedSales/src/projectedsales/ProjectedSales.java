/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectedsales;

/**
 *
 * @author Arturo
 */
public class ProjectedSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ventanorte=4000*0.1;
        double totalnorte=ventanorte+4000;
        double ventasur=5500*0.1;
        double totalsur=ventasur+5500;
        System.out.println("El valor de de la division norte aumentara un 10% de 4000 a: " + totalnorte);
        System.out.println("El valor de de la division sur aumentara un 10% de 5500 a: " + totalsur);
    }
    
}
