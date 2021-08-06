/*
 * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.servicios.ServicioArrays;

/**
 *
 * @author Luis
 */
public class Arrays {
    
    private double vectorA [] = new double [50];
    private double vectorB [] = new double [20];

    public Arrays() {
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }
    
    public static void main(String[] args) {
        
        Arrays array = new Arrays();
        array.setVectorA(ServicioArrays.rellenarVectorA(array.getVectorA()));
        
        
        
    }
    
}
