/*
 * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
VER VIDEOS:
A. Entidad y Control
B. Pasaje por Referencia y por Valor en Java
 */
package com.egg.lgutierrez.guiapoo;

import Servicios.ServicioRectangulo;

/**
 *
 * @author Luis
 */
public class Rectangulo {
    
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.setAltura(ServicioRectangulo.pedirAltura());
        rect.setBase(ServicioRectangulo.pedirBase());
        System.out.println("El rectángulo es de " + rect.getAltura()+ " x " + rect.getBase());
        System.out.println("El perimetro es: " + ServicioRectangulo.definirPerimetro(rect.getAltura(), rect.getBase()));
        System.out.println("El perimetro es: " + ServicioRectangulo.calcularSuperficie(rect.getAltura(), rect.getBase()));
        
    }
    
}
