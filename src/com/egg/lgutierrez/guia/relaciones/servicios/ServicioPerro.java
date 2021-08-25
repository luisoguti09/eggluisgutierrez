/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guia.relaciones.servicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Perro;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class ServicioPerro {
    private List <Perro> perros;

    public ServicioPerro(List<Perro> perros) {
        this.perros = new ArrayList <Perro> ();
    }
    
    public Perro cargarPerro(){
        Perro nuevoPerrito = new Perro();
        nuevoPerrito.setNombre(StringUtils.pedirFraseCustom("Ingrese el Nombre del Perro"));
        nuevoPerrito.setRaza(StringUtils.pedirFraseCustom("Ingrese el nombre del Perro"));
        return nuevoPerrito;
    }   
    
}
