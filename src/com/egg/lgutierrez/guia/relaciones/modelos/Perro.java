/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombrePerro, raza, edad y tamaño; y la clase
Persona con atributos: nombrePerro, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package com.egg.lgutierrez.guia.relaciones.modelos;

/**
 *
 * @author Luis
 */
public class Perro {
    
    private String nombrePerro, raza, apodo;
    private int edad;
    private boolean tieneD;

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public boolean isTieneDueño() {
        return tieneD;
    }

    public void setTieneDueño(boolean tieneDueño) {
        this.tieneD = tieneDueño;
    }

    public Perro(boolean tieneDueño) {
        this.tieneD = tieneDueño;
    }

    public Perro() {
    }

    public Perro(String nombre, String raza, String apodo, int edad) {
        this.nombrePerro = nombre;
        this.raza = raza;
        this.apodo = apodo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombrePerro;
    }

    public void setNombre(String nombre) {
        this.nombrePerro = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombrePerro=" + nombrePerro + ", raza=" + raza + ", apodo=" + apodo + ", edad=" + edad + ", tieneD=" + tieneD + '}';
    }

    

    
    
    
}
