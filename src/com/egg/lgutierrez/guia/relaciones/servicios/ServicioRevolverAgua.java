/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guia.relaciones.servicios;

import com.egg.lgutierrez.guia.relaciones.modelos.RevolverAgua;

/**
 *
 * @author Luis
 */
public class ServicioRevolverAgua {
    RevolverAgua revol = new RevolverAgua();
    
    public void llenarRevolver(){
        int valor1 = (int) (Math.random()*7);
        int valor2 = (int) (Math.random()*7);
        revol.setPosicionActual(valor1);
        revol.setPosicionAgua(valor2);
        System.out.println("La posicion actual es: " + revol.getPosicionActual() + " La posicion actual es: " + revol.getPosicionAgua());
    }
    
}
