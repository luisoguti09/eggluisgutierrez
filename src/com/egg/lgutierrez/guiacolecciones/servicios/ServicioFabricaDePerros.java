/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.servicios;

import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class ServicioFabricaDePerros {
    
    public static String crearRaza() {
        boolean salir = false;
        String respuesta;
            System.out.println("Escriba la raza de su mascota");
            String raza = StringUtils.pedirRespuestaString();
            System.out.println("Escriba el nombre de su mascota");
            String nombre = StringUtils.pedirRespuestaString();
            String mascota = raza + " " + nombre;

        return mascota;   
    }
    
    public static void mostrarPesho(){
        
    }
           
    public static void mostrarRaza (String raza, String nombre){
        boolean salir = false;
        String respuesta;
        do{
            System.out.println("Desea agregar otra mascota?");
        System.out.println("Usted ha ingresado los siguientes datos: ");
        System.out.println("Raza: " + raza);
        System.out.println("Nombre: " + nombre);
        }while(salir);
    }
    }
}
