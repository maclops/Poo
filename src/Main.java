package fev20;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.println("Selecione um exercicio para executar, 3 ou 4");
		int i = sc.nextInt();
		if (i == 3) {
			executaExercicio3();
		} else if (i == 4) {
			executaExercicio4();
		} else {
			System.out.println("Tente de novo");
		}
		
	}

	private static void executaExercicio4() {
		System.out.println("Exercicio 4");
		Funcionario f1 = new Funcionario("Joao", 20, 3.5);
		Funcionario f2 = new Funcionario("Mateus", 40, 5.5);
		Funcionario f3 = new Funcionario("Lucas", 40, 13.5);

		imprimeFuncionario(f1);
		imprimeFuncionario(f2);
		imprimeFuncionario(f3);
	}

	private static void executaExercicio3() {
		System.out.println("Exercicio 3");
		Circulo c1 = new Circulo(32);
		Circulo c2 = new Circulo(44);
		Circulo c3 = new Circulo(17);

		imprimeCirculo(c1);
		imprimeCirculo(c2);
		imprimeCirculo(c3);

	}

	private static void imprimeFuncionario(Funcionario funcionario) {
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.printf("Salario: %.2f\n\n", funcionario.calculaSalario());
	}

	private static void imprimeCirculo(Circulo circulo) {
		System.out.printf("Área do Círculo: %.2f", circulo.calculaAreaCirculo());
		System.out.printf("\nPerímetro do Círculo: %.2f\n\n", circulo.calculaPerimetroCirculo());
	}

}