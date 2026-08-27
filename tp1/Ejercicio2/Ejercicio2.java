package tp1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear e inicializar una instancia
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez",50000.0,"corriente");

        int opcion = 0;

        do {
            System.out.println("\n===== MENÚ BANCARIO =====");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar datos de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = teclado.nextDouble();

                    cuenta.depositar(deposito);

                    System.out.println("\n--- Datos actualizados ---");
                    System.out.println(cuenta);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = teclado.nextDouble();

                    cuenta.retirar(retiro);

                    System.out.println("\n--- Datos actualizados ---");
                    System.out.println(cuenta);
                    break;

                case 3:
                    System.out.println("\n--- Datos de la cuenta ---");
                    System.out.println(cuenta);
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Error: opción inválida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}