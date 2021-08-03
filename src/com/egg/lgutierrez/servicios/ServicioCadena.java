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
package com.egg.lgutierrez.servicios;

import com.egg.lgutierrez.utils.StringUtils;

/**
 *
 * @author Luis
 */
public class ServicioCadena {

    public static String pedirFrase() {
        String frase = StringUtils.pedirFrase();
        return frase;
    }

    public static int medirLongitud(String frase) {
        int longitud = frase.length();
        return longitud;
    }

    public static int mostrarVocales(String frase) {
        int contVocal = 0;
        for(int i=0; i < frase.length(); i++) {
            if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') 
                    || (frase.charAt(i)=='i') || (frase.charAt(i)=='o')
                    || (frase.charAt(i)=='u')){ 
                contVocal++;
            }
        }    
        System.out.println("Se contabilizaron la siguiente cantidad de Vocales");
        return contVocal; 
    }
    
    public static void invertirFrase(String frase){
        char [] invertir = frase.toCharArray();
        for (int i = frase.length()-1; i >= 0; i--){
            System.out.print("" + invertir[i] );
        }   
        System.out.println("");
    }
    
    public static char pedirCaracter(){
        System.out.println("A continuación ingrese un caracter a buscar");
        char caract = StringUtils.pedirRespuestaChar();
        return caract;
    }
    
    public static int mostrarCaracter(String frase, char caracter) {
        int contCaracter = 0;
        for(int i=0; i < frase.length(); i++) {
            if ((frase.charAt(i) ==  caracter)){ 
                contCaracter++;
            }
        }    
        System.out.println("El caracter ingresado se contabilizó la siguiente cantidad de veces ");
        return contCaracter; 
    }
}
