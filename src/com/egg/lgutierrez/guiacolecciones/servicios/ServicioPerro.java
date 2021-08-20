/*
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.

 */
package com.egg.lgutierrez.guiacolecciones.servicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Perro;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Luis
 */
public class ServicioPerro {

    private ArrayList<Perro> perros;

    public ServicioPerro() {
        this.perros = new ArrayList<Perro>();
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    
    public void mostrarRaza() {

        System.out.println("Usted ha ingresado los siguientes datos: ");
        for (Perro aux : this.getPerros()) {
            System.out.println(aux.getRaza());
        }
    }
    
    public String buscarPerro (){
        String nombre;
        System.out.println("Ingrese el nombre de un perro a buscar");
        nombre = StringUtils.pedirRespuestaString();
        return nombre;
    }

    public void eliminaPesho(String nombre){
        Iterator <Perro> it = this.getPerros().iterator() ;
        while (it.hasNext()){
            Perro p = it.next();
            if(p.getRaza().equalsIgnoreCase(nombre)){
                System.out.println("Perro a eliminar " + nombre);
                this.getPerros().remove(p);
                
            }
            
        }
    }
        
    
    
    
            

}
