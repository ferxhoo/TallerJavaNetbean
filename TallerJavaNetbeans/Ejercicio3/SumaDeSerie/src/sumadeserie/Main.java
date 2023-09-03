/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadeserie;

/**
 *Calcular la suma de los términos de la siguiente serie: 1/2 + 2/4 + 3/8 + ... + n/2^n
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos variables
        int n = 5;
        double suma = 0;
        
        //Bucle para realizar la suma de la serie 
        for(int i = 1 ; i <= n; ++i){
            double ecuacion = i / Math.pow(2, i);
            suma = suma + ecuacion;
        }
        
        //Imprimir por pantalla
        System.out.println("La suma de la serie es: " + suma);
    }
    
}
