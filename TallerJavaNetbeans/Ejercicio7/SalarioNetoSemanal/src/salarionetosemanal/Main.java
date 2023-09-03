/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarionetosemanal;

/**
 *Crear un programa que valore el salario neto semanal de los trabajadores de una empresa de acuerdo a las siguientes
 *normas:
 • Horas semanales trabajadas menor que 38 a una tasa.
 • Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
 • Impuestos de 0%, si el salario bruto es menor o igual a 750 euros; 10%, si el salario 
 * bruto es mayor que 750 euros.
 *Lea los datos necesarios para calcular el salario de un trabajador
 * @author JuanFer
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horasTrabajadas = 63;

        double tasaNormal = 10.0; // Tasa de salario por hora normal
        double tasaExtra = tasaNormal * 1.5; // Tasa de salario por hora extra

        // Calcular el salario bruto
        double salarioBruto;
        if (horasTrabajadas <= 38) {
            salarioBruto = horasTrabajadas * tasaNormal;
        } else {
            int horasNormales = 38;
            int horasExtras = horasTrabajadas - 38;
            salarioBruto = (horasNormales * tasaNormal) + (horasExtras * tasaExtra);
        }

        // Calcular los impuestos
        double impuestos;
        if (salarioBruto <= 750) {
            impuestos = 0.0;
        } else {
            impuestos = salarioBruto * 0.10; // 10% de impuestos
        }

        // Calcular el salario neto
        double salarioNeto = salarioBruto - impuestos;

        // Mostrar el salario neto
        System.out.println("Salario Bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuestos + " euros");
        System.out.println("Salario Neto: " + salarioNeto + " euros");
        
    }
    
}
