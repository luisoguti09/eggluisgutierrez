/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.servicios;

import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */
public class ServicioCafetera {
    
    public static float capacidadMaxima(){
        System.out.println("Por favor indiquenos cual es la capacidad máxima de la cafetera en Mililitros");
        int maximo = MathUtils.pedirNumero();
        return maximo;
    }
    
    public static float cantidadCafe(){
        System.out.println("Ahora indique cuántos Mililitros de café tiene la cafetera");
        int cantActual =MathUtils.pedirNumero();
        return cantActual;
    }
    
    public static float llenarCafetera(float maximo, float cantActual){
        boolean lleno = false;
        System.out.println("Desea llenar la cafetera?");
        System.out.println("Responda S / N");
        String respuesta = StringUtils.pedirRespuestaString();
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Cafetera llena, la cantidad de cafe es: " + maximo);
            lleno = true;
        }else{
            System.out.println("De acuerdo esperaremos para llenarla");
            maximo = cantActual;
        }
        
        return maximo;
    }
    
    public static float servirTaza(float cantActual){
        boolean lleno = false;
        float taza = 200;
        float resto = 0;
        System.out.println("Desea llenar la Taza?");
        System.out.println("Responda S / N");
        String respuesta = StringUtils.pedirRespuestaString();
        if(respuesta.equalsIgnoreCase("s")){
            if (taza <= cantActual){
                lleno = true;
                resto = cantActual - taza;
                System.out.println("La taza se ha llenado");
            }else{
                resto = cantActual - taza ;
                System.out.println("La taza no se ha llenado y tiene " + resto);
            } 
        }
        return resto;
    }
    
    public static float vaciarCafetera(float cantActual){
        boolean lleno = false;
        System.out.println("Desea vaciar la cafetera?");
        System.out.println("Responda S / N");
        String respuesta = StringUtils.pedirRespuestaString();
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Cafetera vacía ");
            cantActual = 0;
            lleno = true;
        }else{
            System.out.println("De acuerdo esperaremos para vaciarla");
        }
        return cantActual;
    }
        
    public static float agregarCafe(float cantActual){        
            System.out.println("Desea agregar cafe?");
            System.out.println("Responda S / N");
        String respuesta = StringUtils.pedirRespuestaString();
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Cuanto quiere agregar?");
            float cant = MathUtils.pedirNumero();
            System.out.println("De acuerdo le gregaremos " + respuesta);
            cantActual = cantActual + cant ;
        }else{
            System.out.println("De acuerdo esperaremos para agregarle");
        }
        return cantActual;
    }    



}
