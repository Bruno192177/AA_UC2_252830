/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC
 */
public class Ordenamientos {
    
    /**
     * Implementacion del algoritmo Bubble Sort para ordenar un arreglo de enteros
     * @param arr Arreglo de enteros a ordenar
     */
     public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) { // Se ejecuta (n-1) veces
            intercambio = false;
            
            for (int j = 0; j < n - i - 1; j++) { // Se ejecuta (n-1), (n-2), ..., 1 veces
                if (arr[j] > arr[j + 1]) { // Comparacion
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambio = true;
                }
            }
            
            // Si no hubo intercambios el arreglo ya esta ordenado
            if (!intercambio) break;
        }
    }
}
