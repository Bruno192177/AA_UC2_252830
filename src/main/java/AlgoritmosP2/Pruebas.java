/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosP2;

/**
 *
 * @author PC
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arreglo de datos para probar
        int[] datos = {5, 3, 8, 6, 2};
        
        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        // Llamamos a Insertion Sort
        Ordenamientos.insertionSort(datos);
        
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(datos);
        
        int valorBuscar = 6;

        // Probar Búsqueda Binaria (después de ordenar el arreglo)
        System.out.println("Resultado de Búsqueda Binaria para el valor " + valorBuscar + ":");
        int resultadoBinaria = Busquedas.busquedaBinaria(datos, valorBuscar);
        if (resultadoBinaria != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultadoBinaria);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    /**
     * Método auxiliar para imprimir un arreglo.
     *
     * @param arr Arreglo de enteros a imprimir.
     */
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
               
}
