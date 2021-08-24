/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos
 */
package com.egg.lgutierrez.guiacolecciones.modelos;

import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Pelicula {
    
    private String titulo, director;
    private float duracion;
    private List <Pelicula> pelis;

    public Pelicula(String titulo, float duracion, List<Pelicula> pelicula) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.pelis = pelicula;
    }

    public Pelicula() {
        this.pelis = new ArrayList <Pelicula>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public List<Pelicula> getPelis() {
        return pelis;
    }

    public void setPelis(List<Pelicula> pelis) {
        this.pelis = pelis;
    }
    
    public static Pelicula crearPelicula (){
        Pelicula peli = new Pelicula ();
        peli.setTitulo(StringUtils.pedirFraseCustom("ingrese el título de la Pelicula"));
        peli.setDirector(StringUtils.pedirFraseCustom("Ingrese el nombre del Director de la Pelicula"));
        peli.setDuracion(MathUtils.pedirNumeroCustom("Ingrese la duracion de la Pelicula"));        
        return peli;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", pelis=" + pelis + '}';
    }
    
    
   
    
}
