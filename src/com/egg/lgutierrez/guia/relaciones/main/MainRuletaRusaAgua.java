/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guia.relaciones.main;


import com.egg.lgutierrez.guia.relaciones.modelos.Juego;
import com.egg.lgutierrez.guia.relaciones.modelos.Jugador;
import com.egg.lgutierrez.guia.relaciones.servicios.ServicioJugador;
import com.egg.lgutierrez.guia.relaciones.servicios.ServicioRevolverAgua;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class MainRuletaRusaAgua {
    
    public static void main(String[] args) {
        boolean salir = false;
        ArrayList <Jugador> jugadores = new ArrayList();
        ServicioRevolverAgua sr = new ServicioRevolverAgua();
        ServicioJugador servJ = new ServicioJugador();
        Juego juego = new Juego();
        Jugador loser = null;
        
        sr.llenarRevolver();
        jugadores = servJ.cargarJugadores();
        juego.llenarJuego(jugadores, sr.getRevol());
        for (Jugador player : jugadores) {
            Jugador tmp = juego.ronda(player);
            if(tmp.isMojado()){
                loser = player;
                salir= true;
                break;
            }else{
                System.out.println("El jugador, se salvó");
                System.out.println("Ahora continuaremos con la siguiente potencial victima");
                sr.siguienteChorro();
            }
        }
        
        System.out.println("looser: " + loser.toString());
        
    }
    
    
    
}
