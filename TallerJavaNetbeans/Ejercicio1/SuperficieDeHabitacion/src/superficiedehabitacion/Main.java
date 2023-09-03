/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superficiedehabitacion;

/**
 *Escribir un programa en java que solicite ingresar longitud y anchura de una habitación; hecho esto, visualice su
 *superficie con esos datos.
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos largo y ancho de la habitacion
        double longitud = 11.5;
        double anchura = 12.5;
        
        //La superficie es el area entonces s = l * a
        double superficie = longitud * anchura;
        
        //Imprimimos por pantalla
        System.out.println("Superficie: " + superficie);
        
    }
    
}
