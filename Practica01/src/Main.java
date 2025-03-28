public class Main {
    public static void main(String[] args) {
        // Pruebas para cada algoritmo de búsqueda
        
        int[] arregloOrdenado = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int[] arregloDesordenado = {23, 5, 16, 12, 2, 38, 56, 8, 72, 91};
        int elementoABuscar = 38;
        
        // System.out.println("=== Prueba de Búsqueda Lineal (arreglo desordenado) ===");
        // int resultadoLineal = BusquedaLineal.buscar(arregloDesordenado, elementoABuscar);
        // System.out.println("Resultado: " + resultadoLineal);
        
        // System.out.println("\n=== Prueba de Búsqueda Binaria (arreglo ordenado) ===");
        // int resultadoBinaria = BusquedaBinaria.buscar(arregloOrdenado, elementoABuscar);
        // System.out.println("Resultado: " + resultadoBinaria);
        
        // System.out.println("\n=== Prueba de Búsqueda Exponencial (arreglo ordenado) ===");
        // int resultadoExponencial = BusquedaExponencial.buscar(arregloOrdenado, elementoABuscar);
        // System.out.println("Resultado: " + resultadoExponencial);
        
        // System.out.println("\n=== Prueba de Búsqueda por Interpolación (arreglo ordenado) ===");
        // int resultadoInterpolacion = BusquedaInterpolacion.buscar(arregloOrdenado, elementoABuscar);
        // System.out.println("Resultado: " + resultadoInterpolacion);
        
        // Prueba con elemento no existente
        System.out.println("\n=== Prueba con elemento no existente ===");
        int elementoNoExistente = 100;
        System.out.println("Búsqueda lineal:");
        BusquedaLineal.buscar(arregloDesordenado, elementoNoExistente);
        System.out.println("\nBúsqueda binaria:");
        //BusquedaBinaria.buscar(arregloOrdenado, elementoNoExistente);
    }
}