package tp0;

import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        double lado = 0.0;
        double areaCuadrado = 0.0;
        double base = 0.0;
        double altura = 0.0;
        double areaTriangulo = 0.0;
        double radio = 0.0;
        double areaCirculo = 0.0;

        while (opcion != 4) {

            System.out.println("\n===== CALCULADORA DE FIGURAS =====");
            System.out.println("1. Área de Cuadrado");
            System.out.println("2. Área de Triángulo");
            System.out.println("3. Área de Círculo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    lado = teclado.nextDouble();

                    if (lado < 0) {
                        System.out.println("Error: el lado no puede ser negativo.");
                    } else {
                        areaCuadrado = lado * lado;
                        System.out.println("Área del cuadrado: " + areaCuadrado);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la base del triángulo: ");
                    base = teclado.nextDouble();

                    System.out.print("Ingrese la altura del triángulo: ");
                    altura = teclado.nextDouble();

                    if (base < 0 || altura < 0) {
                        System.out.println("Error: la base y la altura no pueden ser negativas.");
                    } else {
                        areaTriangulo = (base * altura) / 2;
                        System.out.println("Área del triángulo: " + areaTriangulo);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el radio del círculo: ");
                    radio = teclado.nextDouble();

                    if (radio < 0) {
                        System.out.println("Error: el radio no puede ser negativo.");
                    } else {
                        areaCirculo = Math.PI * radio * radio;
                        System.out.println("Área del círculo: " + areaCirculo);
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Error: opción inválida.");
            }
        }

        teclado.close();
    }
}