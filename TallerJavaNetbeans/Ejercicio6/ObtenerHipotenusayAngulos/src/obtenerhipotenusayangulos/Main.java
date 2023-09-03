/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obtenerhipotenusayangulos;

/**
 *. Escribir un programa para obtener la hipotenusa y 
 * los ángulos agudos de un triángulo rectángulo a partir de las
 *longitudes de los catetos
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos las variables de los catetos y damos valor
        double cateto1 = 3.0;
        double cateto2 = 8.0;
        
        //la ecuacion de la hipotenusa es h = raiz de cateto1 al cuadrado mas cateto2 al cuadrado
        double hipotenusa = Math.pow((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)), 0.5);
        
        //La ecuacion para los angulos es arcotan = CO/CA
        //Math funciona como una calculadora entonces la colocamos en DEG
        double AnguloAlfa = Math.toDegrees(Math.atan(cateto1 / cateto2));
        
        double AnguloBeta = Math.toDegrees(Math.atan(cateto2 / cateto1));
        
        //Imprimimos por pantalla
        System.out.println("El Cateto1 es: " + cateto1);
        System.out.println("El Cateto2 es: " + cateto2);
        System.out.println("La Hipotenusa es: " + hipotenusa);
        System.out.println("El Angulo Alfa es: " + AnguloAlfa);
        System.out.println("El Angulo Beta es: " + AnguloBeta);
        
    }
}
