package fev15;

import java.util.Locale;
import java.util.Scanner;

public class um_dez {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();
		func1.setNome(sc.next());
		func1.setHoras(sc.nextDouble());
		func1.setValorHora(sc.nextDouble());
		func2.setNome(sc.next());
		func2.setHoras(sc.nextDouble());
		func2.setValorHora(sc.nextDouble());
		func3.setNome(sc.next());
		func3.setHoras(sc.nextDouble());
		func3.setValorHora(sc.nextDouble());

		System.out.println(func1.nome+" "+func1.calcularSalario(func1.getHoras(), func1.getValorHora()));
		System.out.println(func2.nome+" "+func2.calcularSalario(func2.getHoras(), func2.getValorHora()));
		System.out.println(func3.nome+" "+func3.calcularSalario(func3.getHoras(), func3.getValorHora()));

		sc.close();

	}

}