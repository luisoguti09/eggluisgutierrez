/*
 * 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package com.egg.lgutierrez.ejercicio7;

import com.egg.lgutierrez.guiapoo.entidades.EntidadPersona;
import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */
public class ServicePersona {

    EntidadPersona1 p1 = new EntidadPersona1();

    public void crearPersona() {
        System.out.println("Buenas! por favor ingrese el Nombre de la persona");
        p1.setNombre(StringUtils.pedirRespuestaString());
        System.out.println("Ahora ingrese su edad");
        p1.setEdad(MathUtils.pedirNumero());
        System.out.println("Ingrese el sexo");
        System.out.println("Para Hombre H para Mujer M y otro O");
        do {
            p1.setSexo(StringUtils.pedirRespuestaString());
            if (!p1.getSexo().equalsIgnoreCase("m") && !p1.getSexo().equalsIgnoreCase("h") && !p1.getSexo().equalsIgnoreCase("o")) {
                System.out.println("Esa opción no está en las permitidas vuelva a intentarlo");
            }

        } while (!p1.getSexo().equalsIgnoreCase("m") && !p1.getSexo().equalsIgnoreCase("h") && !p1.getSexo().equalsIgnoreCase("o"));
        System.out.println("Ingresá la altura");
        p1.setAltura(MathUtils.pedirNumero());
        System.out.println("Ahora sin temor igrese su peso");
        p1.setPeso(MathUtils.pedirNumeroDouble());

    }

    public int calcularIMC() {
        double resultado = p1.getPeso() / (Math.pow(p1.getAltura(), 2));

        if (resultado < 20) {
            System.out.println("Entrale a la olla sin temor");
            return -1;
        } else {
            if (resultado >= 20 && resultado <= 25) {
                System.out.println("Estas en tu peso ideal");
                return 0;
            } else {
                System.out.println("Estas con sobre peso");

                return 1;
            }
        }
    }

    public boolean mayorEdad() {
        boolean esMayor;
        esMayor = p1.getEdad() >= 18; 
        return esMayor;
    }

}
