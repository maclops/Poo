package fev15;

public class Paciente {

	String nome;
	double peso;
	double altura;

	double calcularIMC(double peso, double altura) {
		return (peso / (altura * altura));
	}
}
