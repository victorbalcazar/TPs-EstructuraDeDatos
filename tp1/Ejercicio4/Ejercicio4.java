package tp1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear una instancia de Paciente
        Paciente paciente = new Paciente();

        // Solicitar nombre
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = teclado.nextLine();

        paciente.setNombre(nombre);

        // Solicitar DNI
        System.out.print("Ingrese el DNI del paciente: ");
        String dni = teclado.nextLine();

        paciente.setDni(dni);

        // Solicitar peso
        double peso;

        do {
            System.out.print("Ingrese el peso en kg: ");
            peso = teclado.nextDouble();

            if (peso <= 0) {
                System.out.println("Error: el peso debe ser un valor positivo.");
            }

        } while (peso <= 0);

        paciente.setPeso(peso);

        // Solicitar altura
        double altura;

        do {
            System.out.print("Ingrese la altura en metros: ");
            altura = teclado.nextDouble();

            if (altura <= 0) {
                System.out.println("Error: la altura debe ser un valor positivo.");
            }

        } while (altura <= 0);

        paciente.setAltura(altura);

        // Calcular IMC
        double imc = paciente.calcularIMC();

        // Obtener estado nutricional
        String estado = paciente.obtenerEstadoNutricional();

        // Mostrar resultados
        System.out.println("\n===== DATOS DEL PACIENTE =====");
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("DNI: " + paciente.getDni());
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Estado nutricional: " + estado);

        teclado.close();
    }
}