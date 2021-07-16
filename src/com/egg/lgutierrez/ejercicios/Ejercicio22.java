/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package com.egg.lgutierrez.ejercicios;

import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class Ejercicio22 {
    
    private int [] vector = new int [100];

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    public void llenarVector (){
        for (int i = 0; i < 100; i++) {
            this.getVector()[i] = i; 
        }
    }
    
    public void muestraVector (){
        for (int i = 99; i >= 0;i--) {
            System.out.println(this.getVector()[i]);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio22 ejer22 = new Ejercicio22();
        ejer22.llenarVector();
        ejer22.muestraVector();
    }
}
