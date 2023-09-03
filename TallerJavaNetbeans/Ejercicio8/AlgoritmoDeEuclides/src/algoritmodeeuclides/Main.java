/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmodeeuclides;

/**
 *Implementar el algoritmo de Euclides que encuentre el máximo común 
 *divisor de dos números enteros y positivos.
 *Algoritmo de Euclides de m y n:
 *Éste transforma un par de enteros positivos (m, n) en una par (d, o), 
 *dividiendo repetidamente el entero mayor entre el
 *menor y reemplazando con el resto; cuando el resto es 0, el otro entero 
 *de la pareja será el máximo común divisor de
 *la pareja original.
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int m = 532;
        int n = 112;
        
        int rm = m;
        int rn = n;
        
        while (rn != 0) {
            int temp = rn;
            rn = rm % rn;
            rm = temp;
        }
        
        int mcd = rm;

        System.out.println("El Máximo Común Divisor de " + m + " y " + n + " es " + mcd);
        
    }
    
}
