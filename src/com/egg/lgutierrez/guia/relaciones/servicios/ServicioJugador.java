/*
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
9
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package com.egg.lgutierrez.guia.relaciones.servicios;

import com.egg.lgutierrez.guia.relaciones.modelos.Jugador;
import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class ServicioJugador {
    
    
    
    public ArrayList <Jugador> cargarJugadores(){
        ArrayList <Jugador> jugadores = new ArrayList();
        int cantJugadores = MathUtils.pedirNumeroCustom("Ingrese la cantidad de jugadores");
        if (cantJugadores <= 6 && cantJugadores >=1){
            for (int i = 0; i < cantJugadores; i++) {
                Jugador player = new Jugador();
                player.setId(i);
                player.setNombre(StringUtils.pedirFraseCustom("Ingrese el nombre del jugador") + player.getId());
                player.setMojado(false);
                jugadores.add(player);
            }
        }
        return jugadores;
    }
    
    
    
    
}
