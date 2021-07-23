/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class Circunferencia {
    
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    public float crearCircunferencia(){
        this.setRadio(MathUtils.pedirNumeroCustom("Ingresá el radio "));
        return this.getRadio();
    }
    
    public double area(){
        double area = Math.PI * Math.pow(this.getRadio(), radio);
        return area;
    }  
    
    public double perimetro(){
        double perimetro = 2* Math.PI * this.getRadio();
        return perimetro;
    }
    
    public void muestraTodo(){
        System.out.println("El Radio es: " + this.crearCircunferencia());
        System.out.println("El Area es: " + this.area());
        System.out.println("El Perímetro es: " + this.perimetro());
    }
    
    public static void main(String[] args) {
        Circunferencia circus = new Circunferencia();
        circus.muestraTodo();
    }
     
    
    
}
