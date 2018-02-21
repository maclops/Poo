package fev20;

public class Funcionario {

	private String nome;
	private double horasTrabalhadas;
	private double valorHora;

	public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public double calculaSalario() {
		return horasTrabalhadas * valorHora;
	}

	public String getNome() {
		return nome;
	}
	
}