/*
 * 9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package com.egg.lgutierrez.servicios;

/**
 *
 * @author Luis
 */
public class ServicioMatematicas {
    
    public static void devolverMayor(double n1, double n2){
        System.out.println("El mayor de los dos números es: " + Math.max(n2, n1));        
    }
    
    public static void calcularPotencia(double n1, double n2){
        double m;
        double n1Redondo = Math.round(n1);
        double n2Redondo = Math.round(n2);
        if (n1Redondo > n2Redondo){
            m = n1Redondo;
            System.out.println(m + " elevado a la potencia " + n2Redondo);
            System.out.println("Da por resultado " + Math.pow(m, n2Redondo));
        }else{
            m = n2Redondo;
            System.out.println(m + " elevado a la potencia " + n1Redondo);
            System.out.println("Da por resultado " + Math.pow(m, n1Redondo));
        } 
    }
    
    public static void calcularRaizCuad(double n1, double n2){
        double menor;
        double n1Abs = Math.abs(n1);
        double n2Abs = Math.abs(n2);
        if (n1Abs > n2Abs){
            menor = n1Abs;
            System.out.println("Ahora veremos la Raíz cuadrada de " + n1Abs);
            System.out.println(Math.sqrt(n1Abs));
            
        }else{
            menor = n2Abs;
            System.out.println("Ahora veremos la Raíz cuadrada de " + n2Abs);
            System.out.println(Math.sqrt(n2Abs));
        }
    }
}
