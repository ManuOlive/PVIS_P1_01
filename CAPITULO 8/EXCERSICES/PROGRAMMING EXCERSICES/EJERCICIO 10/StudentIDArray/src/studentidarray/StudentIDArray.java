/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentidarray;

import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class StudentIDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> alumnos = new ArrayList<String>();
        ArrayList <Integer> id = new ArrayList<Integer>();
        ArrayList <String> grado = new ArrayList<String>();
        alumnos.add("Luis");
        alumnos.add("Pedro");
        alumnos.add("Lucas");
        alumnos.add("Antonio");
        id.add(0144);
        id.add(0145);
        id.add(0146);
        id.add(0147);
        grado.add("A");
        grado.add("B");
        grado.add("C");
        grado.add("D");
        System.out.println("Alumno: "+alumnos.get(0)+" ID: "+id.get(0)+" Grado: "+grado.get(0));
        System.out.println("Alumno: "+alumnos.get(1)+" ID: "+id.get(1)+" Grado: "+grado.get(1));
        System.out.println("Alumno: "+alumnos.get(2)+" ID: "+id.get(2)+" Grado: "+grado.get(2));
        System.out.println("Alumno: "+alumnos.get(3)+" ID: "+id.get(3)+" Grado: "+grado.get(3));
    }
    
}
