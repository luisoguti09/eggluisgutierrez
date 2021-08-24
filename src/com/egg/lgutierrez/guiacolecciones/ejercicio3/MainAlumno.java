/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicio3;

import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class MainAlumno {
    
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        boolean salir = false;
        do{
        Alumno alumno = Alumno.crearAlumno();
        alumnos.add(alumno);
            salir = StringUtils.pedirFraseCustom("Desea agregar otro? s/n").equalsIgnoreCase("s") ? true : false;

        }while (salir);
        
        Alumno alumno = Alumno.buscarAlumno("dieguin", alumnos);
        
        if (alumno != null) {
            System.out.println("El promedio es: "  + Alumno.mostrarPromedio(alumno)); 
        } else {
            System.out.println("El alumno no se encuentra en esta clase");  
        }
       
       // is lo encontro
       // mostrar promediosout(: Alumno.mostrarPromedio(alumno))
    }
    
}
