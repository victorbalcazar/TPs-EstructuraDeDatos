package tp1;

class TanqueAgua {
		private double capacidadMaxima;
		private double cantidadActual;
		
		public TanqueAgua() {
			this.capacidadMaxima = 100;
			this.cantidadActual = 0;
		}

		public TanqueAgua(double capacidadMaxima, double cantidadActual) {
			if (cantidadActual > capacidadMaxima) {
			    this.cantidadActual = capacidadMaxima;
			} else {
			    this.cantidadActual = cantidadActual;
			}
		}

		public void agregarAgua(double litros) {
			if (this.cantidadActual > this.capacidadMaxima) {
			    this.cantidadActual = this.capacidadMaxima;
			    System.out.println("Advertencia: el tanque se lleno.");
			}
		}
		public void retirarAgua(double litros) {
			this.cantidadActual -= litros;

			if (this.cantidadActual < 0) {
			    this.cantidadActual = 0;
			}
		}
}

