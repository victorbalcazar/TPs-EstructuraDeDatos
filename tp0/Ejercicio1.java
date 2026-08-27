package tp0;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		double horasTrabajadas = 0.0;
		double valorHora = 0.0;
		double salarioBruto = 0.0;
		double horasExtras = 0.0;
		double pagoNormal = 0.0;
		double pagoExtra = 0.0;

        // Datos del trabajador
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = teclado.nextDouble();

        System.out.print("Ingrese el valor de la hora trabajada: ");
        valorHora = teclado.nextDouble();

        // Cálculo del salario bruto
        if (horasTrabajadas <= 40) {
            salarioBruto = horasTrabajadas * valorHora;
        } else {
            horasExtras = horasTrabajadas - 40;
            pagoNormal = 40 * valorHora;
            pagoExtra = horasExtras * (valorHora * 1.5);

            salarioBruto = pagoNormal + pagoExtra;
        }

        // Determinar porcentaje de descuento
        double porcentajeDescuento;

        if (salarioBruto <= 1000000) {
            porcentajeDescuento = 9;
        } else if (salarioBruto <= 3000000) {
            porcentajeDescuento = 12;
        } else {
            porcentajeDescuento = 15;
        }

        // Calcular descuento y salario neto
        double descuento = salarioBruto * (porcentajeDescuento / 100);
        double salarioNeto = salarioBruto - descuento;

        // Mostrar resultados
        System.out.println("\n----- RECIBO DE SUELDO -----");
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Salario neto: $" + salarioNeto);

        teclado.close();

		

	}

}
