package tp1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {

    // Atributos
    private String codigoReserva;
    private String nombreHuesped;
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;

    // Constructor predeterminado
    public Reserva() {
        codigoReserva = "000";
        nombreHuesped = "Por confirmar";
        fechaCheckIn = LocalDate.now();
        fechaCheckOut = fechaCheckIn.plusDays(1);
    }

    // Constructor parametrizado
    public Reserva(String codigoReserva, String nombreHuesped,
                   LocalDate fechaCheckIn, LocalDate fechaCheckOut) {

        this.codigoReserva = codigoReserva;
        this.nombreHuesped = nombreHuesped;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;

        validarFechas();
    }

    // Método auxiliar para validar las fechas
    private void validarFechas() {

        if (!fechaCheckIn.isBefore(fechaCheckOut)) {

            System.out.println(
                "Fechas inválidas. Se utilizará la fecha actual."
            );

            fechaCheckIn = LocalDate.now();
            fechaCheckOut = fechaCheckIn.plusDays(1);
        }
    }

    // Determinar si la reserva está activa
    public boolean estaActiva(LocalDate fechaConsulta) {

        return !fechaConsulta.isBefore(fechaCheckIn)
                && fechaConsulta.isBefore(fechaCheckOut);
    }

    // Calcular días restantes o transcurridos
    public long calcularDiasRestantesOTranscurridos(
            LocalDate fechaConsulta) {

        // Antes del check-in
        if (fechaConsulta.isBefore(fechaCheckIn)) {

            return ChronoUnit.DAYS.between(
                fechaConsulta,
                fechaCheckIn
            );
        }

        // Durante la estadía
        if (estaActiva(fechaConsulta)) {
            return 0;
        }

        // Después del check-out
        return -ChronoUnit.DAYS.between(
            fechaCheckOut,
            fechaConsulta
        );
    }

    // Simular prórroga
    public LocalDate simularProrroga(int cantidadDias) {

        if (cantidadDias < 0) {
            throw new IllegalArgumentException(
                "La cantidad de días no puede ser negativa."
            );
        }

        return fechaCheckOut.plusDays(cantidadDias);
    }

    // toString
    @Override
    public String toString() {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Código de reserva: " + codigoReserva +
                "\nNombre del huésped: " + nombreHuesped +
                "\nFecha Check-In: " + fechaCheckIn.format(formato) +
                "\nFecha Check-Out: " + fechaCheckOut.format(formato);
    }
}