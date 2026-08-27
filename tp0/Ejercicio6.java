package tp0;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        String ciudad = "";
        String pais = "";
        String cadenaFinal = "";

        // Solicitar datos
        System.out.print("Ingrese el nombre de la ciudad: ");
        ciudad = teclado.nextLine();

        System.out.print("Ingrese el nombre del país: ");
        pais = teclado.nextLine();

        // Concatenar ciudad y país
        cadenaFinal = ciudad + ", " + pais;

        // Mostrar cadena concatenada
        System.out.println("\nCadena concatenada: " + cadenaFinal);

        // Cantidad de caracteres
        System.out.println("Cantidad de caracteres de la ciudad: " + ciudad.length());
        System.out.println("Cantidad de caracteres del país: " + pais.length());

        // Comparar longitudes
        if (ciudad.length() > pais.length()) {
            System.out.println("El nombre de la ciudad es más largo.");
        } else if (pais.length() > ciudad.length()) {
            System.out.println("El nombre del país es más largo.");
        } else {
            System.out.println("Los nombres tienen la misma cantidad de caracteres.");
        }

        // Verificar si la ciudad contiene la letra ñ
        if (ciudad.toLowerCase().contains("ñ")) {
            System.out.println("El nombre de la ciudad contiene la letra ñ.");
        } else {
            System.out.println("El nombre de la ciudad no contiene la letra ñ.");
        }

        // Mostrar cadena final en minúsculas
        System.out.println("Cadena final en minúsculas: " + cadenaFinal.toLowerCase());

        teclado.close();
    }
}