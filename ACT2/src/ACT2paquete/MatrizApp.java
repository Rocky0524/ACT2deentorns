package ACT2paquete;

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
                 matriz[i][j] = random.nextInt(100) + 1; //Num aleatorios
             }
         }
    	
         
    	
    }
}
