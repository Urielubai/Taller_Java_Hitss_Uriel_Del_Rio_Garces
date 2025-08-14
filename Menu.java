package ejercicios;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Actualizar");
            System.out.println("2. Crear");
            System.out.println("3. Listar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usuario actualizado correctamente.");
                    break;
                case 2:
                    System.out.println("Usuario creado correctamente.");
                    break;
                case 3:
                    System.out.println("Lista de usuarios:");
                    break;
                case 4:
                    System.out.println("Usuario eliminado correctamente.");
                    break;
                case 5:
                    System.out.println("Has salido con éxito.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 5);

        entrada.close();
    }
}
