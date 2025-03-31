/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosP2;

/**
 *
 * @author PC
 */
public class Ordenamientos {
    
    /**
     * Ordena un arreglo usando el algoritmo Insertion Sort.
     *
     * @param arr Arreglo de enteros a ordenar.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Operación 1
        for (int i = 1; i < n; i++) { // Operación 2
            int key = arr[i]; // Operación 3
            int j = i - 1;  // Operación 4

            // Mueve los elementos mayores que key una posicion adelante
            while (j >= 0 && arr[j] > key) { // Operación 5 (condición)
                arr[j + 1] = arr[j]; // Operación 6 (desplazamiento)
                j--; // Operación 7
            }
            arr[j + 1] = key; // Operación 8 (inserción)
        }
    }
}
