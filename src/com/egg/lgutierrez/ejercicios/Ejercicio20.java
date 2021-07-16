/*
 * 20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package com.egg.lgutierrez.ejercicios;

import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class Ejercicio20 {

    private int numeros[] = new int[4];

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void llenarVector() {
        int indice = 0;
        boolean continuar = true;
        do {
            if (indice < 4) {
                int numero = MathUtils.pedirNumero();
                if (numero >= 1 && numero <= 20) {
                    this.getNumeros()[indice] = numero;
                    indice++;
                }
            } else {
                continuar = false;
            }
            System.out.println(indice);
        } while (continuar);

    }

    public void igualarNum(){
        for(int i = 0; i<this.getNumeros().length;i++){
            System.out.print(this.getNumeros()[i] + ": ");
            for(int j = 0; j<this.getNumeros()[i];j++){
                System.out.print("*");
            }
            System.out.println();    
        }
        
    }
    public static void main(String[] args) {
        Ejercicio20 ejer20 = new Ejercicio20();
        ejer20.llenarVector();
        ejer20.igualarNum();
        
    }
}
