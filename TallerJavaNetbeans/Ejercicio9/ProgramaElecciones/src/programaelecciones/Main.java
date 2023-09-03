/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaelecciones;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Datos de votaciones
        int[][] votosPorComuna = {
            {194, 48, 206, 45},
            {180, 20, 320, 16},
            {221, 90, 140, 20},
            {432, 50, 821, 14},
            {820, 61, 946, 18}
        };

        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C", "Candidato D"};

        // Imprimir la tabla de votaciones con cabeceras
        System.out.println("Comuna\tCandidato A\tCandidato B\tCandidato C\tCandidato D");
        for (int i = 0; i < votosPorComuna.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < votosPorComuna[i].length; j++) {
                System.out.print(votosPorComuna[i][j] + "\t\t");
            }
            System.out.println();
        }

        // Calcular el número total de votos por candidato y su porcentaje de votación
        int[] totalVotosPorCandidato = new int[candidatos.length];
        int totalVotosEmitidos = 0;

        for (int i = 0; i < votosPorComuna.length; i++) {
            for (int j = 0; j < votosPorComuna[i].length; j++) {
                totalVotosPorCandidato[j] += votosPorComuna[i][j];
                totalVotosEmitidos += votosPorComuna[i][j];
            }
        }

        // Encontrar al candidato más votado
        int votosMasVotado = -1;
        String candidatoMasVotado = "";

        for (int i = 0; i < candidatos.length; i++) {
            if (totalVotosPorCandidato[i] > votosMasVotado) {
                votosMasVotado = totalVotosPorCandidato[i];
                candidatoMasVotado = candidatos[i];
            }
        }

        // Calcular el porcentaje de votación por candidato
        double[] porcentajeVotacion = new double[candidatos.length];

        for (int i = 0; i < candidatos.length; i++) {
            porcentajeVotacion[i] = ((double) totalVotosPorCandidato[i] / totalVotosEmitidos) * 100;
        }

        // Imprimir el número total de votos por candidato y su porcentaje de votación
        System.out.println("\nResultados de la votación:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ": " + totalVotosPorCandidato[i] + " votos (" + porcentajeVotacion[i] + "%)");
        }

        // Verificar si algún candidato recibió más del 50% de los votos
        for (int i = 0; i < candidatos.length; i++) {
            if (porcentajeVotacion[i] > 50) {
                System.out.println("\n" + candidatos[i] + " ha sido declarado ganador.");
            }
        }

        // Encontrar la comuna con el mayor porcentaje de votación
        int comunaMayorPorcentaje = -1;
        double mayorPorcentaje = -1;

        for (int i = 0; i < votosPorComuna.length; i++) {
            int totalVotosComuna = 0;
            for (int j = 0; j < votosPorComuna[i].length; j++) {
                totalVotosComuna += votosPorComuna[i][j];
            }
            double porcentajeComuna = ((double) totalVotosComuna / totalVotosEmitidos) * 100;
            if (porcentajeComuna > mayorPorcentaje) {
                mayorPorcentaje = porcentajeComuna;
                comunaMayorPorcentaje = i + 1;
            }
        }

        System.out.println("\nLa comuna con mayor porcentaje de votación es la Comuna " + comunaMayorPorcentaje + " con un " + mayorPorcentaje + "% de votos.");
        
    }
    
}
