/*
 * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package com.egg.lgutierrez.guiapoo;

import com.egg.lgutierrez.servicios.ServicioCuentaBancaria;
import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class CuentaBancaria {
    private long dni;
    private int numeroCuenta;
    private double interes,saldoActual;    
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(long dni, int numeroCuenta, double saldoActual) {
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(){
        System.out.println("Bienvenido a la Banca Gando a la gente!");
        System.out.println("Por favor ingrese su DNI");
        this.setDni(MathUtils.pedirNumero());
        System.out.println("Por favor ingrese su Número de Cuenta");
        this.setNumeroCuenta(MathUtils.pedirNumero());
        System.out.println("Por favor ingrese su cantidad de dinero");
        this.setSaldoActual(MathUtils.pedirNumero());        
    }
    public void mostrarCuenta(){
        System.out.println("Su DNI es: " + this.getDni());
        System.out.println("Su número de cuenta es: " + this.getNumeroCuenta());
        System.out.println("Su saldo Actual es: " + this.getSaldoActual());
    }
    
    public static void main(String[] args) {
        CuentaBancaria cta = new CuentaBancaria();
        cta.crearCuenta();
        cta.setSaldoActual(ServicioCuentaBancaria.ingresaDinero(cta.getSaldoActual()));
        System.out.println(cta.getSaldoActual());
        cta.setSaldoActual(ServicioCuentaBancaria.retiraDinero(cta.getSaldoActual()));
        System.out.println(cta.getSaldoActual());
        System.out.println("Segun su dinero ingresado el Interés a pagar es: " + ServicioCuentaBancaria.tasaInteres(cta.getSaldoActual()));
        cta.setSaldoActual(ServicioCuentaBancaria.generarInteres(cta.getSaldoActual()));
        System.out.println(cta.getSaldoActual());
        cta.setSaldoActual(ServicioCuentaBancaria.extraccionRapida(cta.getSaldoActual()));
        System.out.println(cta.getSaldoActual());
        System.out.println("Los datos de tu cuenta son los siguientes");
        cta.mostrarCuenta();        
    }
    
}
