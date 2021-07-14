package com.egg.lgutierrez.utils;

import java.util.Scanner;

public class StringUtils {
	
	private StringUtils() {
		
	}
	
	/**
	 * 
	 * @return frase leida desde keiboard
	 */
	public static String leerFrase() {
		return Input.getInstance().leerFrase();
	}
	
	
}
