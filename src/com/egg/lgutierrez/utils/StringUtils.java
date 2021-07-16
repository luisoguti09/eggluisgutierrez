package com.egg.lgutierrez.utils;

import java.util.Scanner;



public class StringUtils {
	
	private StringUtils() {
		
	}
	
	/**
	 * 
	 * @return frase leida desde keiboard
	 */
	public static String ingresarPorTeclado() {
		return Input.getInstance().leerFrase();
	}
	
        public static int leerNumero() {
		return Input.getInstance().leerNumero();
        }    
        
        public static String pedirFrase(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresá una frase");
        return scanner.nextLine();
    }
}
