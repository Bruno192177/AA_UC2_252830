/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosP3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = {64, 25, 12, 22, 11};
        
        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        // Llamamos a Selection Sort para ordenar el arreglo
        Ordenamientos.selectionSort(datos);
        
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(datos);

        // Pedir al usuario un numero para buscar en el arreglo ordenado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para buscar en el arreglo: ");
        int numeroBuscar = scanner.nextInt();

        // Realizar busqueda binaria
        int indice = Busquedas.busquedaBinaria(datos, numeroBuscar);

        // Mostrar resultado de la busqueda
        if (indice != -1) {
            System.out.println("El numero " + numeroBuscar + " se encuentra en el indice " + indice);
        } else {
            System.out.println("El numero " + numeroBuscar + " no esta en el arreglo.");
        }
    }

    /**
     * Metodo auxiliar para imprimir un arreglo.
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
