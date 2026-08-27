package tp0;

import java.util.Random;

public class Ejercicio5{

    public static void main(String[] args) {

        Random aleatorio = new Random();
        
        int suma = 0;
        int cantidad = 0;
        int promedio = 0;

        // Generar los tres números aleatorios
        int limiteInferior = aleatorio.nextInt(100) + 1; // 1 a 100
        int limiteSuperior = aleatorio.nextInt(100) + 101; // 101 a 200
        int divisor = aleatorio.nextInt(8) + 2; // 2 a 9

        // Mostrar los números generados
        System.out.println("Límite inferior: " + limiteInferior);
        System.out.println("Límite superior: " + limiteSuperior);
        System.out.println("Divisor: " + divisor);

        System.out.println("\nNúmeros divisibles por " + divisor + ":");

        // Recorrer el rango
        for (int i = limiteInferior; i <= limiteSuperior; i++) {

            // Verificar si es divisible
            if (i % divisor == 0) {
                System.out.println(i);

                suma += i;
                cantidad++;
            }
        }

        // Calcular el promedio entero
        if (cantidad > 0) {
            promedio = suma / cantidad;
            System.out.println("\nPromedio entero: " + promedio);
        } else {
            System.out.println("\nNo se encontraron números divisibles.");
        }
    }
}