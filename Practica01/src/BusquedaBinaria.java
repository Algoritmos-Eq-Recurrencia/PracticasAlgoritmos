public class BusquedaBinaria {
    /**
     * Método para realizar una búsqueda binaria en un arreglo de enteros.
     * @param arreglo El arreglo de enteros donde se realizará la búsqueda.
     * @param valor El valor a buscar en el arreglo.
     * @return La posición del valor encontrado o -1 si no se encuentra.
     */
    public static int buscar(int[] arreglo, int valor){
        int indiceizq = 0;
        int indiceder = arreglo.length - 1;
        int mitad = mitad(indiceizq, indiceder); 
        int iteracion = 0;

        System.out.println("Iniciando búsqueda binaria...");

        while (indiceizq <= indiceder) {
            iteracion++;
            System.out.print("Iteración " + iteracion + ":"+" | ");
            System.out.println("Buscando entre índices " + indiceizq + " y " + indiceder);
            System.out.println("Elemento medio: " + arreglo[mitad]);
            

            // Verifica si el arreglo está vacío o nulo
            if(arreglo == null || arreglo.length == 0){
                // Retorna -1 si el arreglo está vacío o es nulo
                System.out.println("El arreglo está vacío o es nulo.");
                return -1; 
            }
            // Verifica si el valor es igual al elemento medio
            if(arreglo[mitad] == valor){
                System.out.println("El elemento" + valor + " fue encontrado en la posición: " + mitad);
                return mitad;
            }
            // Verifica si el valor es menor o mayor que el elemento medio
            if(arreglo[mitad] < valor){
                // Si el valor es mayor que el elemento del medio, buscar en la mitad derecha
                System.out.println("Buscando en la mitad derecha...");
                indiceizq = mitad + 1;
                mitad = mitad(indiceder, indiceizq);
            } else{
                // Si el valor es menor que el elemento del medio, buscar en la mitad izquierda
                System.out.println("Buscando en la mitad izquierda...");
                indiceder = mitad - 1;
                mitad = mitad(indiceder, indiceizq);
            }
            
        }
        // Si el valor no es encontrado devuelve -1
        System.out.println("El elemento " + valor + " no se encuentra en el arreglo.");
        return -1;
    }

    public static int mitad(int a, int b){
        return (a + b) / 2;
    }
}