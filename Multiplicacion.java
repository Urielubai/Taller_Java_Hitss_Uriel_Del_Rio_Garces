package flujo;

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, numero2;
        System.out.print("Introduce un número: ");
        numero = entrada.nextInt();
        System.out.print("Introduce un segundo número: ");
        numero2 = entrada.nextInt();

        int result = 0;

        for (int i = 0; i < Math.abs(numero2); i++) {
            result += numero;
        }

        if (numero2 < 0) {
            result = -result;
        }

        System.out.println("El resultado de la multiplicación es: " + result);
        entrada.close();
    }
}
