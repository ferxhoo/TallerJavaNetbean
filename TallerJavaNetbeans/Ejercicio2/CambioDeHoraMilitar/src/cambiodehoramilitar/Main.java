/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiodehoramilitar;

/**
 *Escribir un programa que lea la hora en notación de 24 horas 
 *y que imprima en notación de 12; por ejemplo, si la
 *entrada es 13:45, la salida será 1:45 pm. El programa debe 
 *solicitar al usuario que introduzca exactamente cinco
 *caracteres para especificar una hora; por ejemplo, las 9 
 *en punto se debe introducir así: 09:00.
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos variables hr y min
        int hora = 17;
        int minutos = 59;
        String AmPm;
        
        //Declaramos una variable para guardar la hora 00am - 12pm
        int NewHora;
        
        //Condicion para la Nueva hr 
        if(hora == 24 ){
            NewHora = 00;
        }
        else{
            if(hora > 12){
                NewHora = hora - 12;
            }
            else{
            NewHora = hora;
            }
        }
        
        //Condicion para la señalizacion am pm
        if((hora == 24) || (hora < 12)){
            AmPm = " am.";
        }
        else{
            AmPm = " pm.";
        }
        
        //Imprimimos en pantalla
        System.out.println("Hora Militar: " + hora + ":" + minutos + AmPm);
        System.out.println("Hora Común: " + NewHora + ":" + minutos + AmPm);
    }
    
}
