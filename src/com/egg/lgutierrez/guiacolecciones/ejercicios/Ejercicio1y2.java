/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Perro;
import com.egg.lgutierrez.guiacolecciones.servicios.ServicioPerro;
import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */
public class Ejercicio1y2 {
    
    ServicioPerro serv = new ServicioPerro();
    
    public String mostrarMenu(){
        System.out.println("Desea agregar otro perro?");
        String respuesta = StringUtils.pedirRespuestaString();
        return respuesta;
    }
    
    public void crearPerro(){ 
        Perro perro = new Perro();
        perro.setRaza(StringUtils.pedirFraseCustom("Ingrese la Raza de su pichicho"));
        serv.getPerros().add(perro);
        
    }
    
    public void mostrarRaza(){
        serv.mostrarRaza();
    }
    
    public void eliminarPerro(){
        serv.eliminaPesho(serv.buscarPerro());
    }
    
    public static void main(String[] args) {
        String salir = "n";
        Ejercicio1y2 ejer1 = new Ejercicio1y2(); 
        do{
            ejer1.crearPerro();
            salir = ejer1.mostrarMenu();   
        }while(salir.equalsIgnoreCase("s"));
        System.out.println("Los perros ingresados son:");
        ejer1.mostrarRaza();
        ejer1.eliminarPerro();
        System.out.println("La lista actualizada");
        ejer1.mostrarRaza();
    }
    
}
