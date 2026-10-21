/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmoburbuja;

import java.util.Arrays;

/**
 *
 * @author juana
 */
public class AlgoritmoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Caso con Arreglo Desordenado
        int[] desordenado1 = {64, 34, 25, 12, 22, 11, 90};
        int[] desordenado2 = desordenado1.clone(); // Copia exacta para probar el mejorado

        System.out.println("=== PRUEBA 1: ARREGLO DESORDENADO ===");
        System.out.println("Original: " + Arrays.toString(desordenado1));

        ordenamientoBurbuja(desordenado1);
        System.out.println("Burbuja Normal: " + Arrays.toString(desordenado1));

        ordenamientoBurbujaMejorado(desordenado2);
        System.out.println("Burbuja Mejorada: " + Arrays.toString(desordenado2));

        System.out.println("\n-----------------------------------\n");

        // 2. Caso con Arreglo Ya Ordenado (para ver la diferencia de rendimiento)
        int[] ordenado1 = {11, 12, 22, 25, 34, 64, 90};
        int[] ordenado2 = ordenado1.clone();

        System.out.println("=== PRUEBA 2: ARREGLO YA ORDENADO ===");
        System.out.println("Original: " + Arrays.toString(ordenado1));

        ordenamientoBurbuja(ordenado1);
        System.out.println("Burbuja Normal: " + Arrays.toString(ordenado1));

        ordenamientoBurbujaMejorado(ordenado2);
        System.out.println("Burbuja Mejorada: " + Arrays.toString(ordenado2));
    }

    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            boolean huboIntercambio = false; // 1. Reiniciamos la bandera

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    huboIntercambio = true; // 2. Registramos el cambio
                }
            }

            // 3. Verificamos AL TERMINAR la pasada completa del ciclo j
            if (!huboIntercambio) {
                System.out.println("Arreglo ordenado. Se interrumpe en la pasada: " + (i + 1));
                break; // 4. Salimos del ciclo externo i
            }
        }
    }

}
