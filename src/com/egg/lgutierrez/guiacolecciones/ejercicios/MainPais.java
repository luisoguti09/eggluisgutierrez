/*
 * 5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Pais;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Luis
 */
public class MainPais {
   
    public static void main(String[] args) {
        HashMap<String, Pais> paises = new HashMap<String, Pais>();
        boolean salir = false;
        do{
            Pais pais = new Pais();
            pais.setNombre(StringUtils.pedirFraseCustom("Ingresa el nombre del pais"));
            pais.setIdioma(StringUtils.pedirFraseCustom("Ingresa el idioma del pais"));
            paises.put(pais.getNombre(), pais);
            salir = StringUtils.pedirFraseCustom("Desea agregar otro pais o desa salir? agregar/salir").equalsIgnoreCase("salir") ? true : false;        
        }while(!salir);
        
        System.out.println("La lista de todos los paises ingresados es:");
        paises.forEach( (k,v) -> {System.out.println(v.toString());});
        String respuesta = StringUtils.pedirFraseCustom("Trump, Typea el pais que deseas buscar y eliminar");
        paises.forEach( (k,v) -> {System.out.println(v.toString());});
        if (paises.containsKey(respuesta)){
            paises.remove(paises.get(respuesta));
        }
        paises.forEach( (k,v) -> {System.out.println(v.toString());});
  
    }
    
}
