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
    private static int n,m;
    private static int [][] matriz = new int [n][m];

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
    
    public void llenarMatriz (int n,int m){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++){
                
            }
            
        }
    }
    
    public void mostrarMatriz (int n, int m){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++){
                if (i == 0){
                    System.out.print("*");
                if (j == 0 && j == m){
                        System.out.print("*");
                }else{
                    System.out.print(" ");
                    }
                    
                }
            }
            
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Ejercicio19 ejer19 = new Ejercicio19();
        ejer19.setN(MathUtils.pedirNumero());
        ejer19.setM(MathUtils.pedirNumero());
        ejer19.llenarMatriz(n, m);
        ejer19.mostrarMatriz(n, m);
        
    }
    
    
}
