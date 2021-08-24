/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Luis
 */
public class ComparadorDirector implements Comparator <Pelicula>{

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
    }
    
}
