/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicio3;

import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Alumno {
    
    private String nombre;
    private List<Integer> notas;

    public Alumno() {
       this.notas = new ArrayList<Integer>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    
    public static Alumno crearAlumno(){
        Alumno alumno = new Alumno();
        alumno.setNombre(StringUtils.pedirFraseCustom("Ingrese el nombre del alumno"));
        
        for(int i = 1 ; i < 4; i++){
            alumno.getNotas().add(MathUtils.pedirNumeroCustom("Ingrese la nota "+ i +" del Alumno"));   
        }
        return alumno;
    }
    
    public static Alumno buscarAlumno(String nombre, List<Alumno> alumnos){
        Alumno alumno = null;
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                alumno = a;
            }
        }
        return alumno;
    }
    public static int mostrarPromedio (Alumno alumno){
        int promedio = 0;
        for(int i = 0; i < 3; i++ ){
            promedio += alumno.getNotas().get(i);
        }
        promedio /= 3;
        return promedio;
    }
}
