package _03_CLASS_Arrays;

import java.util.Arrays;

public class _0300_Class_Arrays_Teoria {

    // CONCEPTOS BASICOS CLASE Arrays
    // arrays   paso por Referencia (es decir, NO es una copia, cambias el propio array)
    public static void main(String[] args) {
        // DECLARAR ARRAY
        int[] array = new int[5];
        String[] cars_v0;
        String[] cars_v1 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        char[] caracteres = new char[10];

        int[] aux;

        // Acceder a los elementos de un Array
        String[] cars_v2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars_v2[0]); // Outputs Volvo

        //Cambiar un elemento de un array
        cars_v2[0] = "Opel";

        // Longitud de un Array
        int longitud = cars_v1.length; // Output 4

        //Recorrer un Array
        for (int i = 0; i < cars_v1.length; i++) {
            System.out.println(cars_v1[i]);
        }

        //Recorrer una matriz con For-Each
        for (String c : cars_v1) {
            System.out.println(c);
        }

        // COPIAR ARRAYS
        // clone() realiza una copia exacta del array en otro espacio de memoria
        int[] nums = {1, 2, 3, 4, 5};
        int[] copiaNums = nums.clone();

        // ARRAY MULTIDIMENSIONALES
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]); // Output 7
        myNumbers[1][2] = 9;
        //Recorrer un Array multidimensional
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        /* 
   METODOS ARRAYS (java.util.Arrays)

   +-------------------------------+----------------------------------------------+------------------------------+
   |            MÉTODO             |               DESCRIPCIÓN                    |           DEVUELVE           |
   +-------------------------------+----------------------------------------------+------------------------------+
   | Arrays.toString(array)        | Convierte array a String                     | String                       |
   | Arrays.sort(array)            | Ordena el array                              | void                         |
   | Arrays.binarySearch(array,x)  | Busca elemento (array ordenado)              | int (posición)               |
   | Arrays.equals(a1, a2)         | Compara dos arrays                           | boolean                      |
   | Arrays.fill(array, valor)     | Rellena array con un valor                   | void                         |
   | Arrays.copyOf(array, n)       | Copia array con nuevo tamaño                 | array                        |
   | Arrays.copyOfRange(a,i,f)     | Copia rango del array                        | array                        |
   +-------------------------------+----------------------------------------------+------------------------------+
         */
        // ============================================================
        // Declaración e inicialización de arrays
        // ============================================================
        int[] numeros = {5, 2, 9, 1, 3};
        int[] numeros2 = {5, 2, 9, 1, 3};

        // ============================================================
        // Arrays.toString(array) - Convertir array a String
        // ============================================================
        System.out.println("Array: " + Arrays.toString(numeros));

        // ============================================================
        // Arrays.sort(array) - Ordenar array
        // ============================================================
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // ============================================================
        // Arrays.binarySearch(array, x) - Búsqueda binaria
        // (IMPORTANTE: el array debe estar ordenado)
        // ============================================================
        int posicion = Arrays.binarySearch(numeros, 3);
        System.out.println("Posición del 3: " + posicion);

        // ============================================================
        // Arrays.equals(a1, a2) - Comparar arrays
        // ============================================================
        boolean iguales = Arrays.equals(numeros, numeros2);
        System.out.println("¿Arrays iguales?: " + iguales);

        // ============================================================
        // Arrays.fill(array, valor) - Rellenar array
        // ============================================================
        int[] relleno = new int[5];
        Arrays.fill(relleno, 7);
        System.out.println("Array relleno: " + Arrays.toString(relleno));

        // ============================================================
        // Arrays.copyOf(array, nuevoTamaño) - Copiar array
        // ============================================================
        int[] copia = Arrays.copyOf(numeros, 7);
        System.out.println("Copia del array: " + Arrays.toString(copia));

        // ============================================================
        // Arrays.copyOfRange(array, inicio, fin) - Copiar rango
        // (fin NO incluido)
        // ============================================================
        int[] rango = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("Rango del array: " + Arrays.toString(rango));

        // ============================================================
        // Recorrer un array con for
        // ============================================================
        System.out.print("Recorrido con for: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // ============================================================
        // Recorrer un array con for-each
        // ============================================================
        System.out.print("Recorrido con for-each: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
