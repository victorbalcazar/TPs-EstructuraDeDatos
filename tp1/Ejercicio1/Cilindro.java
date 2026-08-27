package tp1;

public class Cilindro {
		
		//Atributos del objeto
	    private double radio;
	    private double altura;
	    
	    
	    
	    //Constructor con atributos inicializados en 1.0
	    public Cilindro() {
			this.radio = 1.0;
			this.altura = 1.0;
		}
	    
	    //Constructor con argumentos
	    public Cilindro(double radio, double altura){
	        this.radio=radio;
	        this.altura=altura;
	    }
	    
	    //getters
		public double getRadio() {
			return radio;
		}
		public double getAltura() {
			return altura;
		}
		
		//ssetters
		public void setRadio(double radio) {
			this.radio = radio;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}

		// Método para calcular el volumen
	    public double calcularVolumen() {
	        return Math.PI * Math.pow(radio, 2) * altura;
	    }

	    // Método para calcular el área de superficie total
	    public double calcularAreaSuperficie() {
	        return 2 * Math.PI * radio * (radio + altura);
	    }
	    
	    
	}
	
