/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */
public class Libro {
    private String titulo,autor;
    private int paginas, isbn;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public void llenarLibro(){
        System.out.println("A continuación ingrese el autor");
       this.setAutor(StringUtils.pedirRespuestaString());
       System.out.println("A continuación ingrese el Título");
       this.setTitulo(StringUtils.pedirRespuestaString());
       System.out.println("A continuación ingrese la cantidad de páginas");
       this.setPaginas(MathUtils.pedirNumero());
       System.out.println("A continuación ingrese el ISBN");
       this.setIsbn(MathUtils.pedirNumero());
    }
    
    public void muestraLibro(){
        System.out.println("El autor se llama: " + this.getAutor());
        System.out.println("El titulo del libro es: " + this.getTitulo());
        System.out.println("El ISBN es: " + this.getIsbn());
        System.out.println("Tiene un total de "+ this.getPaginas() + " páginas");   
    }
     
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.llenarLibro();
        libro.muestraLibro();
    }
}
