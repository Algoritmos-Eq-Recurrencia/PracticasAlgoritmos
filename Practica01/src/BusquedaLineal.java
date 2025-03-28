public class BusquedaLineal {
    /**
     * Método para realizar una búsqueda lineal en un arreglo de enteros.
     * @param arreglo El arreglo de enteros donde se realizará la búsqueda.
     * @param valor El valor a buscar en el arreglo.
     * @return La posición del valor encontrado o -1 si no se encuentra.
     */
    
    public static int buscar(int[] arreglo, int valor){
        // Verifica si el arreglo está vacío o nulo
        if(arreglo == null || arreglo.length == 0){
            // Retorna -1 si el arreglo está vacío o es nulo
            System.out.println("El arreglo está vacío o es nulo.");
            return -1; 
        }
        System.out.println("Iniciando búsqueda lineal...");
        int iteracion = 1;

        for (int i = 0; i < arreglo.length; i++) { 
            System.out.print("Iteración actual: " + iteracion + " | ");
            System.out.println("Comparando " + valor + " con " + arreglo[i]);
            iteracion++;

            // Verifica si el valor es igual al elemento actual
            if (arreglo[i] == valor) {
                 // Retorna la posición del valor encontrado
                System.out.println("Elemento "+ valor + " encontrado en la posición: " + i);
                return i;
            }
        }
        // Si el valor no es encontrado devuelve -1
        System.out.println("Elemento no encontrado en el arreglo.");
        return -1;
    }
}