/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.servicios;

import static com.egg.lgutierrez.guiacolecciones.servicios.ServicioFabricaDePerros.crearRaza;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luis
 */
public class ServicioFabricaDePerros {

    private static ArrayList<String> mascotas = new ArrayList();

    public static ArrayList crearRaza() {
        String respuesta, mascota;
        boolean salir = false;
        do {
            System.out.println("Escriba la raza de su mascota");
            String raza = StringUtils.pedirRespuestaString();
            System.out.println("Escriba el nombre de su mascota");
            String nombre = StringUtils.pedirRespuestaString();
            mascota = raza + " " + nombre;
            mascotas.add(mascota);
            System.out.println("Desea agregar otro Perro?");
            System.out.println("Responda con si o no");
            respuesta = StringUtils.pedirRespuestaString();
            if (respuesta.equalsIgnoreCase("no")) {
                salir = true;
                break;
            } else {
                System.out.println("Escriba la raza de su mascota");
                raza = StringUtils.pedirRespuestaString();
                System.out.println("Escriba el nombre de su mascota");
                nombre = StringUtils.pedirRespuestaString();
                mascota = raza + " " + nombre;
                mascotas.add(mascota);
                break;
            }
        } while (salir);
        return mascotas;
    }

    public static ArrayList<String> getMascotas() {
        return mascotas;
    }

    public static ArrayList mostrarRaza(ArrayList mascotas) {

        System.out.println("Usted ha ingresado los siguientes datos: ");
        for (Object aux : mascotas) {
            System.out.println(mascotas);
        }
        return mascotas;
    }
    
    public static ArrayList buscarPerro (ArrayList mascotas){
        String nombre,m;
        System.out.println("Ingrese el nombre de un perro a buscar");
        nombre = StringUtils.pedirRespuestaString();
        for (int i = 0; i < mascotas.size(); i++) {
             if (mascotas.contains(nombre)){
                 mascotas.remove(nombre);
             }        
        }
        return mascotas;
    }

    public static void eliminaPesho(ArrayList mascotas){
        Iterator <String> it = (Iterator <String>) new ServicioFabricaDePerros();
        while (it.hasNext()){
            String aux = it.next();
            
        }
    }
        
    
    
    
            

}
