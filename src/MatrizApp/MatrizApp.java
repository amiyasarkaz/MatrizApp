package MatrizApp;

import java.util.Random;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];
        
        Random rand = new Random();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
                
            }
            
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
        }
	}

}
