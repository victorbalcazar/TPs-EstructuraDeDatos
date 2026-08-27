package tp0;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        
		int cantidad = 0;
		Double promedio = 0.0;
		int suma = 0;
        int heladas = 0;
        int calidas = 0;

        System.out.print("Ingrese la cantidad de mediciones: ");
        cantidad = teclado.nextInt();

        // Generar las mediciones
        for (int i = 1; i <= cantidad; i++) {

            int temperatura = aleatorio.nextInt(51) - 10;

            System.out.println("Medición " + i + ": " + temperatura + " °C");

            // Acumular temperaturas
            suma += temperatura;

            // Contar heladas
            if (temperatura < 0) {
                heladas++;
            }

            // Contar temperaturas cálidas
            if (temperatura >= 30) {
                calidas++;
            }
        }

        // Calcular promedio
        promedio = (double) suma / cantidad;

        // Mostrar resultados
        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Temperatura promedio: " + promedio + " °C");
        System.out.println("Cantidad de heladas: " + heladas);
        System.out.println("Cantidad de temperaturas cálidas: " + calidas);

        teclado.close();

}

}