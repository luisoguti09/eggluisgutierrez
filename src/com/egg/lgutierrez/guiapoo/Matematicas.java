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
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.servicios.ServicioMatematicas;

/**
 *
 * @author Luis
 */
public class Matematicas {
    
    private double n1,n2;

    public Matematicas() {
    }

    public Matematicas(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public static void main(String[] args) {
        
        Matematicas math = new Matematicas();
        math.setN1(Math.random());
        System.out.println(math.getN1());
        math.setN2(Math.random());
        System.out.println(math.getN2());
        ServicioMatematicas.devolverMayor(math.getN2(), math.getN1());
        ServicioMatematicas.calcularPotencia(math.getN1(), math.getN2());
        ServicioMatematicas.calcularRaizCuad(math.getN1(),math.getN2());
    }
    
}
