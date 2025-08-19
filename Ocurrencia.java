package ejercicios.arreglos;

import java.util.Scanner;

public class Ocurrencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[9];

        System.out.println("Ingrese 10 números enteros entre 1 y 9:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] < 1 || numeros[i] >= 10) {
                System.out.println("Número inválido. Solo se permiten números entre 1 y 9.");
                i--; // Decrementar i para repetir la entrada
            }
        }

        int repetido = 0, ocurrencias = 0;

        // Recorremos el arreglo para contar ocurrencias
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;

            // Contamos cuántas veces aparece numeros[i]
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            // Si encontramos un número que aparece más veces, lo guardamos
            if (contador > ocurrencias) {
                ocurrencias = contador;
                repetido = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("\n*****Resultado****:");
        System.out.println("La mayor ocurrencia es: " + ocurrencias);
        System.out.println("El elemento que más se repite es: " + repetido);

        entrada.close();
    }
}

