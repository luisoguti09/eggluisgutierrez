/*
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package com.egg.lgutierrez.guia.relaciones.modelos;

import com.egg.lgutierrez.guia.relaciones.servicios.ServicioJugador;
import com.egg.lgutierrez.guia.relaciones.servicios.ServicioRevolverAgua;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Juego {
    
    private List <Jugador> jugadores;
    RevolverAgua r;
    ServicioJugador jg;
   
    public Juego() {
        r = new RevolverAgua();
    }
    
    public void llenarJuego(List<Jugador>jugadores, RevolverAgua r){
           this.jugadores = jugadores;
           this.r = r;
    }
    
    public Jugador ronda(Jugador player){
        boolean salir = false;
        ServicioRevolverAgua servR = new ServicioRevolverAgua();
        servR.mojar(player, r);
        return player ;
        
    }
    
}
