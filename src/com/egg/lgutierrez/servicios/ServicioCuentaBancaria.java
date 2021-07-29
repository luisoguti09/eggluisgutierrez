/*
 * • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package com.egg.lgutierrez.servicios;

import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class ServicioCuentaBancaria {
    
    
    public static double ingresaDinero(double saldo){
       double ingreso;
       System.out.println("Cuánto dinero quiere ingresar?");
        ingreso = MathUtils.pedirNumero();
        ingreso = ingreso + saldo;
        System.out.println("Su Saldo actual es:");
        return ingreso;
    }
    
    public static double retiraDinero(double saldo){
        double retiro;
        System.out.println("Cuánto Dinero Quiere retirar");
        retiro = MathUtils.pedirNumero();
        if (retiro <= saldo){
            saldo = saldo - retiro ;
        }else {
            saldo = 0;
            System.out.println("Ese importe supera al de su cuenta! Por vivo su saldo actual es $0");
        }
        return saldo;
    }
    
    public static double tasaInteres(double saldo){
        if(saldo >= 1000 && saldo <= 1000000){
            return  1.37f;
        }
        if(saldo <= 1000001){
            return 1.34f;
        }
        if (saldo >= 999){
            System.out.println("Volvé cuando tengas más plata");
        } 
        return 0f;
    }
    
    public static double generarInteres(double saldo){
        if(saldo >= 1000 && saldo <= 1000000){
            return (saldo * 1.37f);
        }
        if(saldo >= 1000001){
            return (saldo * 1.34f);
        }
        if (saldo >= 999){
            System.out.println("Volvé cuando tengas más plata");
        } 
        return 0f;
    }
    
    public static double extraccionRapida(double saldo){
        double retiro, valorMaximo;
        
        System.out.println("Cuanto dinero Express quiere retirar?");
        retiro = MathUtils.pedirNumero();
        valorMaximo = (20 * saldo) / 100; 
        if (retiro <= valorMaximo){
           return saldo - retiro;
        }else{
            System.out.println("No se permite retirar mas del 20% en este método");
        }
        return saldo;
    }
    
    
    
   
}
