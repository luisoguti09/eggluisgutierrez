/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Alumno;
import com.egg.lgutierrez.guiacolecciones.modelos.Perro;
import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Ejercicio3 {
    private ArrayList <Alumno> alumnos;
    
    

    public Ejercicio3() {
    }

    public Ejercicio3(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    Alumno alum = new Alumno();
    
    public void crearAlumno(){        
        alum.setAlumno(StringUtils.pedirFraseCustom("Ingrese el Nombre del Alumno"));
    }
    
    public String mostrarMenu(){
        String respuesta = StringUtils.pedirFraseCustom("Desea agregar otro alumno?");
        return respuesta;
    }
    
    public void mostrarRaza() {

        System.out.println("Usted ha ingresado los siguientes datos: ");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNotas());
        }
            
        }
    }
    
    public int ingresarNotas(){
        int n1 = MathUtils.pedirNumeroCustom("Ingrese la nota 1");
        int n2 = MathUtils.pedirNumeroCustom("Ingrese la nota 2");
        int n3 = MathUtils.pedirNumeroCustom("Ingrese la nota 3");
        int promedio = (n1 + n2 + n3) /3;
        return promedio;
    }
    
    public static void main(String[] args) {
        Ejercicio3 ejer3 = new Ejercicio3();
        String salir = "no";
        do{
            ejer3.crearAlumno();
            salir = ejer3.mostrarMenu();
        }while(salir.equalsIgnoreCase("si"));
        System.out.println("Los alumnos ingresados son");
        
    }
}
