package fev15;

import java.util.Locale;
import java.util.Scanner;

public class um_nove {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();
		func1.setNome("João");
		func1.setHoras(20);
		func1.setValorHora(3.5);
		func2.setNome("Mateus");
		func2.setHoras(40);
		func2.setValorHora(5.5);
		func3.setNome("Lucas");
		func3.setHoras(40);
		func3.setValorHora(13.5);

		System.out.println(func1.nome+" "+func1.calcularSalario(func1.getHoras(), func1.getValorHora()));
		System.out.println(func2.nome+" "+func2.calcularSalario(func2.getHoras(), func2.getValorHora()));
		System.out.println(func3.nome+" "+func3.calcularSalario(func3.getHoras(), func3.getValorHora()));

		sc.close();

	}

}