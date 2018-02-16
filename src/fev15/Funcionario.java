package fev15;

public class Funcionario {

	String nome;
	double horas;
	double valorHora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	double calcularSalario(double horas, double valorHora) {
		return (horas * valorHora);
	}

}
