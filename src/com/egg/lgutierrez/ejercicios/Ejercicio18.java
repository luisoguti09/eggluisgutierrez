/*
 * 18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package com.egg.lgutierrez.ejercicios;


import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */

public class Ejercicio18 {
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    public static void main(String[] args) {
        boolean continuar = true;
        int contador = 0 ;
        
        Ejercicio18 ejer18 = new Ejercicio18();
        String contadorString;
       do{
           contadorString = String.format("%03d",contador);
           String centena = String.valueOf(contadorString.charAt(0));
           String decena = String.valueOf(contadorString.charAt(1));
           String unidad = String.valueOf(contadorString.charAt(2));
           if (unidad.equals("3")){
               unidad = "E";
           }
           
           if (decena.equals("3")){
               decena = "E";
           }
           
           if (centena.equals("3")){
               centena = "E";
           }
           
           System.out.println(centena + "-" + decena + "-" + unidad);
           contador++;
  
           if (contador > 999){
               continuar = false;
           }           
       }while(continuar);
    }
 
    
}
