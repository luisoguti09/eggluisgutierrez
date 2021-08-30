/*
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package com.egg.lgutierrez.guia.relaciones.servicios;

import com.egg.lgutierrez.guia.relaciones.modelos.Jugador;
import com.egg.lgutierrez.guia.relaciones.modelos.RevolverAgua;
import java.util.Random;

/**
 *
 * @author Luis
 */
public class ServicioRevolverAgua {
    RevolverAgua revol = new RevolverAgua();

    public RevolverAgua getRevol() {
        return revol;
    }

    public void setRevol(RevolverAgua revol) {
        this.revol = revol;
    }
    
    public void llenarRevolver(){
        Random r = new Random();
        int valor1 = r.nextInt(6);
        int valor2 = r.nextInt(6);
        System.out.println("valor 1: " + valor1);
        System.out.println("valor 2: " + valor2);
        revol.setPosicionActual(valor1);
        revol.setPosicionAgua(valor2);   
    }
    
    
    public void mojar(Jugador jg,RevolverAgua r){
        if (r.getPosicionActual()== r.getPosicionAgua()){
            System.out.println("mojado");
            jg.setMojado(true);
        }    
    }
    
    public void siguienteChorro(){
        revol.setPosicionActual(revol.getPosicionActual()+1);
    }

    @Override
    public String toString() {
        return "ServicioRevolverAgua{" + "revol=" + revol + '}';
    }
    
    
        
    
}
