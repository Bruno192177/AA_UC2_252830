/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC
 */
public class Busquedas {
     // Metodo de Busqueda Lineal
    public static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;  // Retorna el indice del elemento encontrado
            }
        }
        return -1;  // Retorna -1 si no se encuentra el objetivo
    }

    // Metodo de Busqueda Binaria
    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;
        
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            
            if (arr[medio] == objetivo) {
                return medio;
            }
            if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;  // Retorna -1 si no se encuentra el objetivo
    }
}
