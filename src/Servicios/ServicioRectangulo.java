/*
 * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
 */
package Servicios;

import com.egg.lgutierrez.utils.MathUtils;

/**
 *
 * @author Luis
 */
public class ServicioRectangulo {
    
    private 
    /**
     *
     */
    public static int pedirBase(){
        int base;
        System.out.println("Ahora te pediremos que ingreses el tamaño de la base");
        base = MathUtils.pedirNumero();
        return base;
        
    }
    
    public static int pedirAltura(){
        int altura;
        System.out.println("Ahora te pediremos que ingreses el tamaño de la altura");
        altura = MathUtils.pedirNumero();
        return altura;
    }
   
    
    public static int definirPerimetro(int altura, int base){
        int perimetro;
        perimetro = (base * 2) + (altura *2);
        return perimetro;
    }
    
    public static int calcularSuperficie (int altura, int base){
        int superficie = base * altura;
        return superficie;
    }
    
    public static int mostrarRect(int altura; int base) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < this.getN(); j++) {
                if ( i == 0 ) {
                    System.out.print("*");
                    if (j == this.getN()-1)
                        System.out.println();
                    
                }  else {
                    if (j == 0 ){
                        System.out.print("*");
                    } else if (j == this.getN()-1){
                        System.out.println("*");
                        
                    } else {
                        if(i!=this.getN()-1){
                             System.out.print(" ");
                        }
                       
                    }
                }
                if(i==this.getN()-1) {
                    if(j!=0 && j!= this.getN()-1){
                        System.out.print("*");
                    }
                }
                         
            }
        }

    }
}
