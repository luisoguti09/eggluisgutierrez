/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.servicios.ServicioFabricaDePerros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class FabricaDePerros {
    
    private String raza, nombre;
    private List mascotas;

    public FabricaDePerros() {
    }

    public FabricaDePerros(String raza, String nombre, ArrayList<String> mascotas) {
        this.raza = raza;
        this.nombre = nombre;
        this.mascotas = new ArrayList();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getMascotas() {
        return mascotas;
    }

    

    public void setMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    
    public static void main(String[] args) {
       
        FabricaDePerros fab = new FabricaDePerros();
                
        fab.setMascotas(ServicioFabricaDePerros.crearRaza());
        fab.setMascotas(ServicioFabricaDePerros.mostrarRaza((ArrayList) fab.getMascotas()));
        
        
        
    }
}
