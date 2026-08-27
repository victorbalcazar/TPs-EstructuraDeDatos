package tp1;

public class Paciente {

    // Atributos
    private String nombre;
    private String dni;
    private double peso;
    private double altura;

    // Métodos para establecer y obtener el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos para establecer y obtener el DNI
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    // Métodos para establecer y obtener el peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    // Métodos para establecer y obtener la altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    // Calcular IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Determinar estado nutricional
    public String obtenerEstadoNutricional() {

        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}