/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosP3;

/**
 *
 * @author PC
 */
public class Ordenamientos {
    /**
     * Ordena un arreglo usando el algoritmo Selection Sort.
     *
     * @param arr Arreglo de enteros a ordenar.
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Operacion 1

        for (int i = 0; i < n - 1; i++) { // Operacion 2 (n-1 veces)
            int minIndex = i; // Operacion 3 (n-1 veces)

            for (int j = i + 1; j < n; j++) { // Operacion 4 (sumatoria de n-1, n-2,...,1)
                if (arr[j] < arr[minIndex]) { // Operacion 5 (comparacion)
                    minIndex = j; // Operacion 6 (asignacion)
                }
            }

            // Intercambiar elementos si es necesario
            if (minIndex != i) { // Operacion 7
                int temp = arr[minIndex]; // Operacion 8
                arr[minIndex] = arr[i]; // Operacion 9
                arr[i] = temp; // Operacion 10
            }
        }
    }
}
