/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observerbiblio;


/**
 *
 * @author Michael
 */
public class ObserverBiblio {

    public static void main(String[] args) {
        //crear observadores
        Observer ob1 = new Observer();
        Observer ob2 = new Observer();
        Subject Libro = new Subject();
        //Registrar observador
        System.out.println("Registrando un observador...");
        Libro.register(ob1);
        
        //Cambiar estado de flag
        System.out.println("Estado del Libro: " + Libro.getFlag());
        Libro.setFlag(1);
        System.out.println("Estado del libro: " + Libro.getFlag());
        //Registrar otro  observador
        System.out.println("Registrando observador 2...");
        Libro.register(ob2);
        //Cambiar estado de flag
        System.out.println("Estado del libro: " + Libro.getFlag());
        Libro.setFlag(2);
        System.out.println("Estado del libro: " + Libro.getFlag());
        //Dessuscribirse
        Libro.unregister(ob1);
       
        //Cambiar estado de flag
        System.out.println("Estado del libro: " + Libro.getFlag());
        Libro.setFlag(3);
        System.out.println("Estado del libro: " + Libro.getFlag());
        
    }
}
