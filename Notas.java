package ejercicios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
   Scanner entrada = new Scanner(System.in);
   double nota, suma = 0;

   int contadorp = 0, contadorn = 0;

   for (int i = 0; i < 20; i++) {
       System.out.print("Ingrese la nota " + (i + 1) + ": ");
       nota = entrada.nextDouble();
       if(nota >= 6 && nota <= 10){
           contadorp++;
           suma += nota;
       } else if(nota < 6 && nota > 0){
           contadorn++;
           suma += nota;
       } else {

           System.out.println("Nota inválida.....");
           return;
       }
    }
    System.out.println("Total de aprobados: " + contadorp);
    System.out.println("Total de reprobados: " + contadorn);
    System.out.println("El promedio de notas es: " + suma / 20.0);
}

}
