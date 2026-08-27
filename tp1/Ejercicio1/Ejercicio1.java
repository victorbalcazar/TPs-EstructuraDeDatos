package tp1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear una única instancia
        Cilindro cilindro = new Cilindro();

        double radio = 0.0;
        double altura = 0.0;

        // Solicitar radio hasta que sea positivo
        do {
            System.out.print("Ingrese el radio del cilindro: ");
            radio = teclado.nextDouble();

            if (radio <= 0) {
                System.out.println("Error: el radio debe ser mayor que cero.");
            }

        } while (radio <= 0);

        // Solicitar altura hasta que sea positiva
        do {
            System.out.print("Ingrese la altura del cilindro: ");
            altura = teclado.nextDouble();

            if (altura <= 0) {
                System.out.println("Error: la altura debe ser mayor que cero.");
            }

        } while (altura <= 0);

        // Establecer las dimensiones del cilindro
        cilindro.setRadio(radio);
        cilindro.setAltura(altura);

        // Calcular resultados
        double volumen = cilindro.calcularVolumen();
        double area = cilindro.calcularAreaSuperficie();

        // Mostrar resultados con dos decimales
        System.out.printf("%nVolumen del cilindro: %.2f%n", volumen);
        System.out.printf("Área de superficie total: %.2f%n", area);

        teclado.close();
    }
}
