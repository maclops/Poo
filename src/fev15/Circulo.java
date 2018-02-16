package fev15;

public class Circulo {

	double raio;

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	double calcularArea(double raio) {
		return Math.PI * (raio * raio);
	}

	double calcularPerimetro(double raio) {
		return (2 * Math.PI * raio);
	}

}
