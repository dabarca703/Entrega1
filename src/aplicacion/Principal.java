package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 6};
        int[] lista2 = {2, 3, 2, 4, 6};
        
        System.out.println("Ejercicio 1: Suma de 5: " + Matematicas.suma(5));
        System.out.println("Ejercicio 2: Factorial de 5: " + Matematicas.factorial(5));
        System.out.println("Ejercicio 3: 2^5: " + Matematicas.potencia(2, 5));
        System.out.println("Ejercicio 4: Suma de lista: " + Matematicas.sumaLista(lista));
        System.out.println("Ejercicio 5: Media de lista: " + Matematicas.mediaLista(lista));
        System.out.println("Ejercicio 6: Desviación típica de lista: " + Matematicas.desviacionTipica(lista));
        System.out.println("Ejercicio 7: Suma de pares hasta 9: " + Matematicas.sumaPares(9));
        System.out.println("Ejercicio 8: Suma de pares en lista: " + Matematicas.sumaParesLista(lista));
        System.out.print("Ejercicio 9: Lista de pares en la misma posición: "); Matematicas.obtenerListaPar(lista);
        System.out.print("Ejercicio 10: Lista de pares hasta 9: "); Matematicas.listaPares(9);
        System.out.println("Ejercicio 11: Producto escalar de listas: " + Matematicas.productoEscalar(lista, lista2));
        System.out.println("Ejercicio 12: Fibonacci(10): " + Matematicas.fibonacci(10));
        System.out.println("Ejercicio 13: Cociente F(13)/F(12): " + Matematicas.cocienteFibonacci());
        System.out.println("Ejercicio 14: Razón áurea: " + Matematicas.razonAurea());
    }
}



