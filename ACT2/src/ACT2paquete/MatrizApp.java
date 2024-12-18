package ACT2paquete;

import java.util.Scanner;
import java.util.Random;

public class MatrizApp {
    public static void main(String[] args) {
        // TODO: Implementar las funciones según las ramas asignadas


		int filas = 5;
		int columnas = 5;
		int[][] matriz = new int[filas][columnas];

		Random random = new Random();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = random.nextInt(100) + 1; // Num aleatorios
			}
		}

		System.out.println("Matriz de 5x5 de números aleatorios entre 1 y 100:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		// Pedir al usuario un número para buscar
		Scanner s = new Scanner(System.in);
		System.out.println("¿Qué número quieres buscar?");
		int numeroBuscado = s.nextInt();

		// Buscar el número en la matriz
		boolean encontrado = false;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (matriz[i][j] == numeroBuscado) {
					System.out.println("Número encontrado en la posición: fila " + i + ", columna " + j);
					encontrado = true;
				}
			}
		}

		// Mensaje si el número no se encuentra
		if (!encontrado) {
			System.out.println("El número " + numeroBuscado + " no se encuentra en la matriz.");
		}
		 // Calcular la suma de todos los números en la matriz
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j]; // Sumamos cada número
            }
        }

        // Mostrar la suma
        System.out.println("La suma de todos los números en la matriz es: " + suma);
    }
}
