Declaración de variables:

int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];
        Random rand = new Random();
        
Llenado de la matriz:

for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
                
Impresión de la matriz:

 for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
Entrada del usuario:

Scanner scanner = new Scanner(System.in);
System.out.print("\nIngrese el número a buscar: ");
int buscar = scanner.nextInt();
        
Búsqueda del número en la matriz:

boolean listo = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == buscar) {
                    System.out.println("El número " + buscar + " está en la posición: Fila " + (i + 1) + ", Columna " + (j + 1));
                    listo = true;
                    break; 
                }
            }	
        if (listo) {
            break; 
	    
Verificación si el número fue encontrado:

 if (!listo) {
        System.out.println("El número " + buscar + " no existe en la matriz.");
