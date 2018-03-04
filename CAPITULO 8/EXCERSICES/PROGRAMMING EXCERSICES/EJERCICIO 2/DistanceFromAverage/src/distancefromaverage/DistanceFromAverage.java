/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancefromaverage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class DistanceFromAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ArrayList <Integer> num = new ArrayList<Integer>();
        int valor;
        for(int i=0;i<10;i++){
            System.out.println("Ingresa un numero: ");
            valor = entrada.nextInt();
            num.add(valor);
        }
        System.out.println("Los numeros que ingreso sin: "+num);
    }
    
}
