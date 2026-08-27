package tp0;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int totalPreguntas = 0;
        int respuestasCorrectas = 0;
        double porcentaje = 0.0;

        // Solicitar datos
        System.out.print("Ingrese la cantidad total de preguntas: ");
        totalPreguntas = teclado.nextInt();

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        respuestasCorrectas = teclado.nextInt();

        // Calcular porcentaje
        porcentaje = ((double) respuestasCorrectas / totalPreguntas) * 100;

        // Clasificar rendimiento
        String categoria;

        if (porcentaje >= 90) {
            categoria = "Excelente";
        } else if (porcentaje >= 70) {
            categoria = "Muy Bueno";
        } else if (porcentaje >= 50) {
            categoria = "Aprobado";
        } else {
            categoria = "Desaprobado";
        }

        // Mostrar resultados
        System.out.println("\n----- RESULTADO -----");
        System.out.println("Porcentaje: " + porcentaje + "%");
        System.out.println("Categoría: " + categoria);

        teclado.close();
    }
}
