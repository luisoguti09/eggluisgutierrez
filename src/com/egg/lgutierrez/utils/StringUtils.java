package com.egg.lgutierrez.utils;



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
}
