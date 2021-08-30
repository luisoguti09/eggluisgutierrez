/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor .
 */
package com.egg.lgutierrez.utils;

import java.util.ArrayList;
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
    
     public static int pedirNumeroCustom(String frase){
        Scanner scanner = new Scanner(System.in);
        System.out.println(frase);
        return scanner.nextInt();
    }
     
    public static int pedirNota(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresá la nota");
        return scanner.nextInt(); 
    } 
    
    public static double pedirNumeroDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresá un número");
        return scanner.nextDouble();
    }
    
    public static ArrayList pedirNumCustom(String frase){
        ArrayList numero = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println(frase);
        numero.add(scanner.nextInt());
        return numero;
    }
    
}
