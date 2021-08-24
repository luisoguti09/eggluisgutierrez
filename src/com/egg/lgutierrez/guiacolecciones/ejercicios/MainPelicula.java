/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Pelicula;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class MainPelicula {
    
    public static void main(String[] args) {
        List <Pelicula> pelis = new ArrayList <Pelicula>();
        boolean salir = false;
        do{
        Pelicula peli = Pelicula.crearPelicula();
        pelis.add(peli);
        salir = StringUtils.pedirFraseCustom("Desea agregar otra peli? s/n").equalsIgnoreCase("s") ? true : false;
        }while (salir);
        System.out.println("Las peliculas ingresadas son:");
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());  
        }
        System.out.println("Las peliculas con duracion mayor a 1 hora");
        for (Pelicula peli : pelis) { 
            if(peli.getDuracion()>1){
                System.out.println(peli.toString());
            }
        }
        
         System.out.println("Mostrar peliculas con duracion descendente");
        pelis.sort(new ComparadorDuracionDescendente());
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());  
        }
        
        System.out.println("Mostrar peliculas con duracion ascendente");
        pelis.sort(new ComparadorDuracionAscendente());
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());  
        }
        System.out.println("Mostrar peliculas ordenadas por Titulo");
        pelis.sort(new ComparadorTitulo());
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());  
        }
        System.out.println("Peliculas ordenadas por Director");
        pelis.sort(new ComparadorDirector());
        for (Pelicula peli : pelis) {
            System.out.println(peli.toString());  
        }
    }
    
}
