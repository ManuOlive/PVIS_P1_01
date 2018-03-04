/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlistdemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class NumberListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ArrayList <Integer> arreglo = new ArrayList <Integer>();
        arreglo.add(1);
        arreglo.add(2);
        arreglo.add(7);
        arreglo.add(3);
        arreglo.add(6);
        arreglo.add(23);
        arreglo.add(17);
        arreglo.add(210);
        System.out.println("Ingresa la opcion: ");
        System.out.println("1)Mostrar valores\n2)Mostrar Valores al reves\n3)Suma de valores\n4)Valor mas chico\n4)Valor mas alto\n5)Valor ordenado del mas grande la mas chico");
        int opcion=entrada.nextInt();
        if(opcion==1){
            System.out.println(arreglo);
        }
        if(opcion==2){
            System.out.println(arreglo.get(7)+" "+arreglo.get(6)+" "+arreglo.get(5)+" "+arreglo.get(4)+" "+arreglo.get(3)+" "+arreglo.get(2)+" "+arreglo.get(1)+" "+arreglo.get(0));
        }
        if(opcion==3){
            int contador=0;
            int aux;
            for(int i=0;i<arreglo.size();i++){
                aux=arreglo.get(i);
                contador=contador+aux;
            }
            System.out.println(contador);
        }
        if(opcion==4){
            int menor = 0;
            for(int i=1;i<arreglo.size();i++){
                if(arreglo.get(i)<arreglo.get(menor)){
                menor = i;
                }
            }
            System.out.println(menor);
        }
    }
    
}
