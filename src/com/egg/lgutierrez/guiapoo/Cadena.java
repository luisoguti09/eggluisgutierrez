/*
 * 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.servicios.ServicioCadena;

/**
 *
 * @author Luis
 */
public class Cadena {
    
    private String frase;
    private char caracter;
    
    public Cadena(char caracter) {
        this.caracter = caracter;
    }
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
    
    
    public static void main(String[] args) {
        Cadena cad = new Cadena();
        String nuevaFrase;
        cad.setFrase(ServicioCadena.pedirFrase());
        cad.setLongitud(ServicioCadena.medirLongitud(cad.getFrase()));
        System.out.println(ServicioCadena.mostrarVocales(cad.getFrase()));
        System.out.println("La frase invertida es: ");
        ServicioCadena.invertirFrase(cad.getFrase());
        cad.setCaracter(ServicioCadena.pedirCaracter());
        System.out.println(ServicioCadena.mostrarCaracter(cad.getFrase(),cad.getCaracter()));
        nuevaFrase = ServicioCadena.pedirNuevaFrase();
        ServicioCadena.comparaLongitudes(cad.getFrase(), nuevaFrase);
        ServicioCadena.unirFrases(cad.getFrase(), nuevaFrase);
        String newChar = ServicioCadena.elijaCaract();
        String reemplazado = ServicioCadena.reemplazaChar(cad.getFrase(), newChar);
        System.out.println(reemplazado);
        if(ServicioCadena.contieneChar(cad.getFrase(), newChar)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
       
        
    }
    
}
