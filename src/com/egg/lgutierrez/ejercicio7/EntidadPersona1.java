/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.ejercicio7;

/**
 *
 * @author Luis
 */
public class EntidadPersona1 {
    private int edad;
   private double altura, peso;
   private String sexo, nombre;
   
   public EntidadPersona1() {
    }

    public EntidadPersona1(int edad, double altura, double peso, String sexo, String nombre) {
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
