/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informedeventas;

/**
 *. Un vendedor minorista en línea requiere un informe de las ventas del día. 
 *Para ello cuenta con tres arreglos de n
 *elementos cada uno: A, B y C. El primero almacena el código de los productos 
 *vendidos en el día, El segundo almacena
 *el valor de venta de cada producto, y el tercero la cantidad de unidades 
 *vendidas de cada producto.
 *Requiere un aplicativo que le calcule rápidamente los siguientes datos:
• Total productos vendidos en el día.
• Total ingresos por ventas del día.
• El producto más vendido.
• El producto más costoso vendido.
 * @author JuanFer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Definir los arreglos A, B y C con los datos de ventas
        int[] codigoProductos = {1, 2, 3, 4, 5};
        double[] valorVenta = {10.5, 8.75, 12.0, 15.25, 9.99};
        int[] cantidadVendida = {50, 75, 30, 45, 60};

        // Calcular el total de productos vendidos en el día
        int totalProductos = 0;
        for (int cantidad : cantidadVendida) {
            totalProductos += cantidad;
        }

        // Calcular el total de ingresos por ventas del día
        double totalIngresos = 0;
        for (int i = 0; i < codigoProductos.length; i++) {
            totalIngresos += valorVenta[i] * cantidadVendida[i];
        }

        // Encontrar el producto más vendido y el producto más costoso vendido
        int productoMasVendido = codigoProductos[0];
        double productoMasCostoso = valorVenta[0];
        
        for (int i = 1; i < codigoProductos.length; i++) {
            if (cantidadVendida[i] > cantidadVendida[i - 1]) {
                productoMasVendido = codigoProductos[i];
            }
            
            if (valorVenta[i] > productoMasCostoso) {
                productoMasCostoso = valorVenta[i];
            }
        }

        // Imprimir los resultados
        System.out.println("Total productos vendidos en el día: " + totalProductos);
        System.out.println("Total ingresos por ventas del día: $" + totalIngresos);
        System.out.println("Producto más vendido (código): " + productoMasVendido);
        System.out.println("Producto más costoso vendido (código): " + productoMasCostoso);
        
    }
    
}
