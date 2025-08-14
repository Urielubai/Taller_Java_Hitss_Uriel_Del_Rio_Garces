package ejercicios;
import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, compara;
        int menor, mayor;

        System.out.print("Ingrese los numeros a comparar: ");
        compara = entrada.nextInt();
        
        if(compara < 11){
            System.out.println("El numero debe ser mayor a 10");
        }else{
            
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();
        menor = numero;
        mayor = numero;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El menor número es: " + menor);
        System.out.println("El mayor número es: " + mayor);
    }
}
}

