/*
 * Crear una clase llamada alumno que mantenga información sobre las notas de
distintos alumnos. La clase alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto alumno. Se pide toda la
información al usuario y ese alumno se guarda en una lista de tipo alumno y se le
pregunta al usuario si quiere crear otro alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
Ejemplo de una colección como atributo: ColeccionAtributo

 */
package com.egg.lgutierrez.guiacolecciones.modelos;

import com.egg.lgutierrez.utils.MathUtils;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Alumno {
    
    private String alumno;
    private ArrayList <Integer> notas;

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public Alumno() {
        this.notas = new ArrayList();
    }

    public Alumno(String Alumno) {
        this.alumno = Alumno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String Alumno) {
        this.alumno = Alumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", notas=" + notas + '}';
    }
    
    public void pedirNotas(ArrayList<Alumno> alumnos){
        
        for (Alumno alumno : alumnos){
            int nota = 1;
            for (int i = 0; i < 3; i++) {
                alumno.getNotas().add(Integer.valueOf(MathUtils.pedirNumCustom("Ahora ingrese la nota numero: "+ nota +" del Alumno").toString()));
            }
        }
    }
    
    public void mostrarNotas (ArrayList <Alumno> alumnos){
        
    }
}
