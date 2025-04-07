/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosP4;

/**
 *
 * @author PC
 */
public class Ordenamientos {
    /**
     * Ordena un arreglo usando el algoritmo QuickSort.
     * @param arr El arreglo a ordenar.
     * @param low Indice inicial del arreglo.
     * @param high Indice final del arreglo.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) { // Operacion 1
            int pi = partition(arr, low, high); // Operacion 2
            quickSort(arr, low, pi - 1); // Operacion 3
            quickSort(arr, pi + 1, high); // Operacion 4
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Operacion 5
        int i = (low - 1); // Operacion 6
        for (int j = low; j < high; j++) { // Operacion 7
            if (arr[j] < pivot) { // Operacion 8
                i++; // Operacion 9
                int temp = arr[i]; // Operacion 10
                arr[i] = arr[j]; // Operacion 11
                arr[j] = temp; // Operacion 12
            }
        }
        int temp = arr[i + 1]; // Operacion 13
        arr[i + 1] = arr[high]; // Operacion 14
        arr[high] = temp; // Operacion 15

        return i + 1; // Operacion 16
    }

}

