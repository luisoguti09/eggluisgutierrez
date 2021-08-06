/*
 * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package com.egg.lgutierrez.servicios;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class ServicioArrays {
    
    public static double[] rellenarVectorA (double vectorA[]){
        for ( int i = 0; i < vectorA.length; i ++){ 
            vectorA[i] = Math.random();
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.println(format.format(vectorA[i]));
        } 
        return vectorA;
    }
    
    public static double[] ordenarVector (double vectorA[]){
        Arrays.sort(vectorA);
        for ( int i = 0; i < vectorA.length; i ++){ 
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.println(format.format(vectorA[i]));
        } 
        return vectorA;
    }
    
    public static double[] copiarVector (double vectorA[], double vectorB[]){
        Arrays.copyOf(vectorA, 9);
        for ( int i = 0; i < 10; i ++){ 
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.println(format.format(vectorB[i]));
        } 
        return vectorB;
    }
    
    public static double[] llenarVectorB (double vectorB[]){
        Arrays.fill(vectorB, 0.5);
        for ( int i = 10; i < vectorB.length; i ++){ 
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.println(format.format(vectorB[i]));
        } 
        return vectorB;
    }
    
    
    
    
    
}
