/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1  = new Persona("Juan", 5000.00, false);
         System.out.println("persona1 = " + persona1);
//        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
//        System.out.println("persona1 = " + persona1.getNombre());
//        System.out.println("Sueldo = " + persona1.getSueldo());
//        System.out.println("Eliminado = "+persona1.isEliminado());
        
        
        persona1.setNombre("Jose Aguirre");
        persona1.setSueldo(8000.00);
        persona1.setEliminado(false);
//        System.out.println("persona1 nombre= " + persona1.getNombre());
//        System.out.println("persona1 sueldo= " + persona1.getSueldo());
//        System.out.println("Persona eliminado = "+persona1.isEliminado());

        System.out.println("persona1 = " + persona1);
    }
}
