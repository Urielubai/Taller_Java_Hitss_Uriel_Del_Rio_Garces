package ejercicios;

import java.util.Scanner;

public class ResturanteMenu {
        public static void main(String[] args) {

               Scanner entrada = new Scanner(System.in); 

            int opcion, total=0;
            double precio, suma=0;
            String platillo, pedidos = "";

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Resgistratr un pedido");
            System.out.println("2. Ventas Totales");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del platillo: ");
                    entrada.nextLine(); // Limpiar el buffer
                    platillo = entrada.nextLine().strip();
                    System.out.print("Precio del platillo: ");
                    precio = entrada.nextDouble();
                    if (precio > 0) {
                        suma += precio;
                        total++;
                    } else {
                        System.out.println("Precio inválido. Inténtalo de nuevo.");
                    }

                     // Concatenar el pedido al historial
                    if (pedidos.isEmpty()) {
                        pedidos = platillo;
                    } else {
                        pedidos += ", " + platillo;
                    }

                    System.out.println("Pedido registrado.");
                    
                    break;
                case 2:
                    System.out.println("Total de ventas: " + total);
                    System.out.println("Pedidos realizados: " + pedidos.toUpperCase());
                    System.out.println("Total a pagar: $" + suma);
                    break;
                case 3:
                    System.out.println("Has salido con éxito.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 3);

        entrada.close();
    }
}
