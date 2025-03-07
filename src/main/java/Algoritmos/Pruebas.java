/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arreglo de prueba
        int[] numeros = {5, 3, 8, 4, 2};

        // Mostrar arreglo antes de ordenar
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // Aplicar Bubble Sort
        Ordenamientos.bubbleSort(numeros);

        // Mostrar arreglo después de ordenar
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);

        // Ejemplo de Búsqueda Lineal
        int resultadoLineal = Busquedas.busquedaLineal(numeros, 4);
        if (resultadoLineal != -1) {
            System.out.println("Búsqueda Lineal: Elemento 4 encontrado en índice: " + resultadoLineal);
        } else {
            System.out.println("Búsqueda Lineal: Elemento 4 no encontrado");
        }

        // Ejemplo de Búsqueda Binaria
        int resultadoBinaria = Busquedas.busquedaBinaria(numeros, 8);
        if (resultadoBinaria != -1) {
            System.out.println("Búsqueda Binaria: Elemento 8 encontrado en índice: " + resultadoBinaria);
        } else {
            System.out.println("Búsqueda Binaria: Elemento 8 no encontrado");
        }
    }

    /**
     * Método auxiliar para imprimir un arreglo de enteros.
     * @param arr Arreglo a imprimir.
     */
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
