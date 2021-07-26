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
    
    public void pedirBase(){
        int base;
        System.out.println("Ahora te pediremos que ingreses el tamaño de la base");
        base = MathUtils.pedirNumero();
        
        
    }
    
    public void pedirAltura(){
        int altura;
        System.out.println("Ahora te pediremos que ingreses el tamaño de la altura");
        altura = MathUtils.pedirNumero();
    }
   
    
    public int creaectangulo(){
        
        
        return 0;
    }
    
}
