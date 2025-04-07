/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosP4;

/**
 *
 * @author PC
 */
public class Busquedas {
     public static int busquedaBinaria(int[] arr, int target) {
        int low = 0; // Operacion 1
        int high = arr.length - 1; // Operacion 2

        while (low <= high) { // Operacion 3 (hasta log n veces)
            int mid = low + (high - low) / 2; // Operacion 4

            if (arr[mid] == target) { // Operacion 5
                return mid; // Operacion 6
            }

            if (arr[mid] < target) { // Operacion 7
                low = mid + 1; // Operacion 8
            } else {
                high = mid - 1; // Operacion 9
            }
        }
        return -1; // Operacion 10
    }
}
