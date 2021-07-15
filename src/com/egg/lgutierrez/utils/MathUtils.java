/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.lgutierrez.utils;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class MathUtils {
    
    public static int pedirNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresá un número");
        return scanner.nextInt();
    }
    
     public static String pedirFrase(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresá una frase");
        return scanner.nextLine();
    }
     
    public static int pedirNota(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresá la nota");
        return scanner.nextInt(); 
    }  
    
}
