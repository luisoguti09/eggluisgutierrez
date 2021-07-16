/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package com.egg.lgutierrez.ejercicios;

import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */
public class Ejercicio21 {
    
    private int euro;
    private String monedaDestino;

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }
    
    public void candidadEuros(){
        System.out.println("Cuántos Euros va a querer convertir?");
        this.setEuro(MathUtils.pedirNumero());
        
    }
    
    public void elijaDivisa (){
        System.out.println("Ahora le pediremos que ingrese la moneda que desea convertir");
        this.setMonedaDestino(StringUtils.pedirFrase());
    }
    
    public void convertirDivisa (){
        if (this.getMonedaDestino().equalsIgnoreCase("dolar")){
            System.out.println("La cantidad de dolares es: " +this.getEuro()*1.28611);
        }
        if(this.getMonedaDestino().equalsIgnoreCase("libras")){
            System.out.println("La cantidad de libras es: " +this.getEuro()*0.86);
        }
        if(this.getMonedaDestino().equalsIgnoreCase("yenes")){
            System.out.println("La cantidad de yenes es: " + this.getEuro()*129.852);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio21 ejer21 = new Ejercicio21();
        ejer21.candidadEuros();
        ejer21.elijaDivisa();
        ejer21.convertirDivisa();

    }

    
}
