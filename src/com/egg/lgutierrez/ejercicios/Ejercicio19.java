/*
 * 19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package com.egg.lgutierrez.ejercicios;

import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class Ejercicio19 {

    private static int n, m;
    private static int[][] matriz = new int[n][m];

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void llenarMatriz(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }

        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < this.getN(); i++) {
            for (int j = 0; j < this.getN(); j++) {
                if ( i == 0 ) {
                    System.out.print("*");
                    if (j == this.getN()-1)
                        System.out.println();
                    
                }  else {
                    if (j==0 ){
                        System.out.print("*");
                    } else if (j==this.getN()-1){
                        System.out.println("*");
                        
                    } else {
                        if(i!=this.getN()-1){
                             System.out.print(" ");
                        }
                       
                    }
                }
                if(i==this.getN()-1) {
                    if(j!=0 && j!= this.getN()-1){
                        System.out.print("*");
                    }
                }
                         
            }
        }

    }

    public static void main(String[] args) {
        Ejercicio19 ejer19 = new Ejercicio19();
        System.out.println("Ahora te vamos a pedir el tamaño del cuadrado");
        ejer19.setN(MathUtils.pedirNumero());
     //  ejer19.llenarMatriz(ejer19.getN());
        ejer19.mostrarMatriz();

    }

}
