/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Event {

    /**
     * @param args the command line arguments
     */
    private Integer invitados;
    public void setInvitados(Integer e) {
        invitados = e;
    }
    public Integer getInvitados() {
        return invitados;
    }
    public Integer operacion() {
        Integer resul = invitados*35;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Event x=new Event();
        System.out.println("    ****************************************************");
        System.out.println("    *\tCarly’s makes the food that makes it a party.  *");
        System.out.println("    ****************************************************");
        System.out.println("Ingrese la cantidad de invitados: ");
        x.setInvitados(entrada.nextInt());
        if (x.getInvitados()>=50){
            System.out.println("¡¡¡Fiesta Grande!!!");
            System.out.println("El precio es de: " + x.operacion()+" Pesos");
            for(int i=0;i<x.getInvitados();i++){
                System.out.println("Ven a mi fiesta");
            }
        }else{
            System.out.println("¡¡¡Fiesta Pequeña!!!");
            System.out.println("El precio es de: " + x.operacion()+" Pesos");
            for(int i=0;i<x.getInvitados();i++){
                System.out.println("Ven a mi fiesta");
            }
        }
    }

    
}
