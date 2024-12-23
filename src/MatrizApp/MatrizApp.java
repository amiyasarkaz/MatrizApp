package MatrizApp;

import java.util.Scanner;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("\nIngrese el número a buscar: ");
        int buscar = scanner.nextInt();
        
        boolean listo = false;
        
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == buscar) {
                    System.out.println("El número " + buscar + " está en la posición: Fila " + (i + 1) + ", Columna " + (j + 1));
                    listo = true;
                    break; 
                }
            }
           
        }
		
        if (listo) {
            break; 
   
    if (!listo) {
        System.out.println("El número " + buscar + " no existe en la matriz.");
	
        

    }
    
        }
        
	}
	
}
	

	

