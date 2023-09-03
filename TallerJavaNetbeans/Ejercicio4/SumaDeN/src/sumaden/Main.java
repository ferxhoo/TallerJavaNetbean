/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaden;

/**
 *Encontrar un número natural N más pequeño de forma que la suma de los N 
 *primeros números exceda una cantidad
 *introducida por el teclado.
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables necesarias
        int n = 5;
        int suma = 0;
        int contador = 1;
        
        //Bucle condicional donde la suma de n numeros sea menor que n
        while(suma < n){
            suma = suma + contador;
            contador = contador + 1;
        }
        
        //Imprimimos por pantalla
        System.out.println("El número natural N más pequeño cuya suma de los N primeros números excede " + n + " es " + contador);
    }
    
}
