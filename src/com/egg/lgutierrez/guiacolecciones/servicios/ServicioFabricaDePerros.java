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
    
    public static void crearRaza() {
        String respuesta;    
        boolean salir = false;
        do{
            System.out.println("Desea agregar otro Perro?");
            System.out.println("Responda con si o no");
            respuesta = StringUtils.pedirRespuestaString();
            if (respuesta.equalsIgnoreCase("si") ){
                salir = true;
                System.out.println("Escriba la raza de su mascota");
                String raza = StringUtils.pedirRespuestaString();
                System.out.println("Escriba el nombre de su mascota");
                String nombre = StringUtils.pedirRespuestaString();  
                String mascota = raza + " " + nombre;              
            }else{
                System.out.println("Hasta la próxima");
            }
        }while (salir);
    }
           
    public static void mostrarRaza (String raza, String nombre){
        
        System.out.println("Usted ha ingresado los siguientes datos: ");
        System.out.println("Raza: " + raza);
        System.out.println("Nombre: " + nombre); 
    }
}
