/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guia.relaciones.servicios;

import com.egg.lgutierrez.guia.relaciones.modelos.Perro;
import com.egg.lgutierrez.guia.relaciones.modelos.Persona;
import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;

 

/**
 *
 * @author Luis
 */
public class ServicioPersona {
    
    
    public static Persona cargarPersona(){
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre(StringUtils.pedirFraseCustom("Ingresá el nombre de la persona"));
        nuevaPersona.setApellido(StringUtils.pedirFraseCustom("Ingresá el apellido de la persona"));
        nuevaPersona.setEdad(MathUtils.pedirNumeroCustom("Ingresá la edad de la Persona"));
        nuevaPersona.setDni(MathUtils.pedirNumeroCustom("Ingresá el DNI de la Persona"));
        return nuevaPersona;
    }
    
    public static void adoptarPesho(Persona p1, ArrayList <Perro> perros){
        int contador = 0;
        for (Perro perro : perros) {
            System.out.println(contador+1 + "-----" + perro.toString());
            contador++;
        }
        int respuesta = MathUtils.pedirNumeroCustom("Cuál mascota desea adoptar?");
        p1.setPerrito(perros.get(respuesta-1));
        perros.get(respuesta -1).setTieneDueño(true);
        return;
    }
    
    
}
