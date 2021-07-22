/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiapoo;

/**
 *
 * @author Luis
 */
public class Persona  {
    private String nombre;
     private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("luis");
        
        Persona p2 = new Persona("diego");
        
        Persona p3 = new Persona("agostina", "gutierrez", 10);
        
        
        System.out.println("nombre p1 " + p1.getNombre());
        System.out.println("apellido p1" + p1.getApellido());
         System.out.println("nombre p2 " + p2.getNombre());
         System.out.println("nombre p2 " + p2.getApellido());
          System.out.println("nombre p3 " + p3.getNombre());
          System.out.println("nombre p3 " + p3.getApellido());
    }
    
    
}
