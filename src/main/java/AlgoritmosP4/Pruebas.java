/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosP4;

/**
 *
 * @author PC
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = {9, 4, 7, 3, 1, 8, 2};

        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        // QuickSort
        Ordenamientos.quickSort(datos, 0, datos.length - 1);

        System.out.println("Arreglo ordenado con QuickSort:");
        imprimirArreglo(datos);

        // Búsqueda binaria
        int objetivo = 4;
        int posicion = Busquedas.busquedaBinaria(datos, objetivo);

        if (posicion != -1) {
            System.out.println("Elemento " + objetivo + " encontrado en la posicion " + posicion);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
