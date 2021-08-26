/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guia.relaciones.main;

import com.egg.lgutierrez.guia.relaciones.modelos.Perro;
import com.egg.lgutierrez.guia.relaciones.modelos.Persona;
import com.egg.lgutierrez.guia.relaciones.servicios.ServicioPerro;
import com.egg.lgutierrez.guia.relaciones.servicios.ServicioPersona;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class PersonaYPerro {
    
    public static void main(String[] args) {
        ArrayList <Perro> perros = new ArrayList();
        Persona p1 = ServicioPersona.cargarPersona();
        Persona p2 = ServicioPersona.cargarPersona();
        Perro pesho1 = ServicioPerro.cargarPerro();
        Perro pesho2 = ServicioPerro.cargarPerro();
        perros.add(pesho1);
        perros.add(pesho2);
        ServicioPersona.adoptarPesho(p1, perros);
        ServicioPersona.adoptarPesho(p2, perros);
        System.out.println("Los datos finales son: " + p1.toString());
        System.out.println("Los datos finales son: " + p2.toString());
        //servH1.adoptarPesho(servP1.toString(), servP1.toString(), true);
        
        
        
        
    }
    
}
