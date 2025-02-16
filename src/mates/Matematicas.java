package mates;

public class Matematicas {
    
    // Ejercicio 1: Suma de 0 a n
    public static int suma(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Ejercicio 2: Factorial de un número
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Ejercicio 3: Potencia n-ésima de un número
    public static int potencia(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    // Ejercicio 4: Suma de una lista de números
    public static int sumaLista(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Ejercicio 5: Media aritmética de una lista de números
    public static double mediaLista(int[] arr) {
        return (arr.length == 0) ? 0 : (double) sumaLista(arr) / arr.length;
    }

    // Ejercicio 6: Desviación típica de una lista de números
    public static double desviacionTipica(int[] arr) {
        double media = mediaLista(arr);
        double sum = 0;
        for (int num : arr) {
            sum += Math.pow(num - media, 2);
        }
        return Math.sqrt(sum / arr.length);
    }

    // Ejercicio 7: Suma de los primeros números pares hasta n
    public static int sumaPares(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    // Ejercicio 8: Suma de elementos pares en una lista
    public static int sumaParesLista(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) sum += num;
        }
        return sum;
    }

    // Ejercicio 9: Lista de números pares en el mismo orden
    public static void obtenerListaPar(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println();
    }

    // Ejercicio 10: Lista de los primeros números pares hasta n
    public static void listaPares(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // Ejercicio 11: Producto escalar de dos listas
    public static int productoEscalar(int[] arr1, int[] arr2) {
        int product = 0;
        for (int i = 0; i < arr1.length; i++) {
            product += arr1[i] * arr2[i];
        }
        return product;
    }

    // Ejercicio 12: n-ésimo término de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Ejercicio 13: Cociente entre F(13) y F(12)
    public static double cocienteFibonacci() {
        return (double) fibonacci(13) / fibonacci(12);
    }

    // Ejercicio 14: Relación entre Fibonacci y la razón áurea
    public static double razonAurea() {
        return (1 + Math.sqrt(5)) / 2;
    }
}

