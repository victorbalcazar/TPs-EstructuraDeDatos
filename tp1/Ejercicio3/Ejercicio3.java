package tp1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio3 {

    // Método para ingresar una fecha válida
    public static LocalDate ingresarFecha(Scanner teclado, String mensaje) {

        while (true) {

            try {

                System.out.println(mensaje);

                System.out.print("Día: ");
                int dia = teclado.nextInt();

                System.out.print("Mes: ");
                int mes = teclado.nextInt();

                System.out.print("Año: ");
                int anio = teclado.nextInt();

                return LocalDate.of(anio, mes, dia);

            } catch (DateTimeException e) {

                System.out.println(
                    "Error: la fecha ingresada no es válida."
                );
            }
        }
    }

    // Crear una reserva solicitando los datos
    public static Reserva crearReserva(
            Scanner teclado, int numeroReserva) {

        System.out.println(
            "\n===== RESERVA " + numeroReserva + " ====="
        );

        System.out.print("Ingrese el código de reserva: ");
        String codigo = teclado.next();

        teclado.nextLine();

        System.out.print("Ingrese el nombre del huésped: ");
        String nombre = teclado.nextLine();

        LocalDate checkIn = ingresarFecha(teclado,"Ingrese la fecha de CHECK-IN:");

        LocalDate checkOut = ingresarFecha(teclado,"Ingrese la fecha de CHECK-OUT:");

        return new Reserva(codigo,nombre,checkIn,checkOut);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear dos reservas
        Reserva reserva1 = crearReserva(teclado, 1);
        Reserva reserva2 = crearReserva(teclado, 2);

        // Fecha de consulta
        System.out.println("\n===== FECHA DE CONSULTA =====");

        LocalDate fechaConsulta = ingresarFecha(teclado,"Ingrese la fecha que desea consultar:");

        // Procesar las dos reservas
        procesarReserva(teclado, reserva1, fechaConsulta, 1);
        procesarReserva(teclado, reserva2, fechaConsulta, 2);

        teclado.close();
    }

    // Procesar cada reserva
    public static void procesarReserva(Scanner teclado,Reserva reserva,LocalDate fechaConsulta,int numeroReserva) {

        System.out.println("\n=================================");
        System.out.println("        RESERVA " + numeroReserva);
        System.out.println("=================================");

        // Mostrar datos
        System.out.println(reserva);

        // Verificar si está activa
        boolean activa = reserva.estaActiva(fechaConsulta);

        System.out.println("\n¿La reserva está activa? " + activa);

        // Calcular días
        long dias =reserva.calcularDiasRestantesOTranscurridos(fechaConsulta);

        if (dias > 0) {

            System.out.println("Faltan " + dias +" días para el Check-In.");

        } else if (dias == 0) {

            System.out.println("La fecha de consulta está dentro de la estadía.");

        } else {

            System.out.println("Han transcurrido " + Math.abs(dias) +" días desde el Check-Out."
            );
        }

        // Prórroga
        System.out.print("\nIngrese cantidad de días para simular una prórroga: ");

        int cantidadDias = teclado.nextInt();

        while (cantidadDias < 0) {

            System.out.println("Error: la cantidad de días no puede ser negativa.");

            System.out.print("Ingrese nuevamente la cantidad de días: ");

            cantidadDias = teclado.nextInt();
        }

        LocalDate nuevaFecha = reserva.simularProrroga(cantidadDias);

        System.out.println("Nueva fecha de Check-Out: " + nuevaFecha);
    }
}