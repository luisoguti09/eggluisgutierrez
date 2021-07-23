/*
 * 3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
17
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class Operacion {
    
    private int numero1, numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int creaOperacionN1 (){
        this.setNumero1(MathUtils.pedirNumeroCustom("Ingresá un número"));
        return this.getNumero1();
    }
    
    public int creaOperacionN2 (){
        this.setNumero2(MathUtils.pedirNumeroCustom("Ingresá un número"));
        return this.getNumero2();
    }
    
    public int sumar(){
        int suma ;
        suma = this.getNumero1() + this.getNumero2();
        System.out.println("La Suma de " + this.getNumero1() + " y " + this.getNumero2() + " es " + suma);
        return suma;
    }
    
    public int restar(){
        int resta = 0 ;
        System.out.println("La Resta de " + this.getNumero1() + " y " + this.getNumero2() + " es " + resta);
        return resta;
    }
    
    public int multiplicar(){
        int multiplicar = 1;
        if(this.getNumero1()>0 && this.getNumero2()>0){
           multiplicar = this.getNumero1() * this.getNumero2(); 
        }
        System.out.println("La Multiplicación de " + this.getNumero1() + " y " + this.getNumero2() + " es " + multiplicar);
        return multiplicar;
    }
    
    public float dividir(){
        float dividir = 1;
        if(this.getNumero1()>0 && this.getNumero2()>0){
           dividir = this.getNumero1() / this.getNumero2(); 
        }
        System.out.println("La División de " + this.getNumero1() + " y " + this.getNumero2() + " es " + dividir);
        return dividir;
    }
    
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.creaOperacionN1();
        op.creaOperacionN2();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
    }
    
}
