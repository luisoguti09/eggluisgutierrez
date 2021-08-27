/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.guiacolecciones.ejercicios;

import com.egg.lgutierrez.guiacolecciones.modelos.Producto;
import com.egg.lgutierrez.utils.MathUtils;
import com.egg.lgutierrez.utils.StringUtils;
import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class MainProducto {
    
    public static void main(String[] args) {
        HashMap <String,Producto> productos = new HashMap <String, Producto>();
        boolean salir = false;
        do{
            Producto prod = new Producto();
            prod.setProducto(StringUtils.pedirFraseCustom("Ingresa el nombre del pais"));
            prod.setPrecio(MathUtils.pedirNumeroCustom("Ingresa el idioma del pais"));
            productos.put(prod.getProducto(), prod);
            salir = StringUtils.pedirFraseCustom("Desea agregar otro producto o desa salir? agregar/salir").equalsIgnoreCase("salir") ? true : false;        
        }while(!salir);
        System.out.println("La lista de los productos ingresados es: ");
        
    }
    
}
