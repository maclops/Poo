package fev15;

import java.util.Locale;
import java.util.Scanner;

public class um_sete {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		Circulo c1 = new Circulo();
		System.out.println("Digite tres valores de raio");
		c1.setRaio(sc.nextDouble());
		Circulo c2 = new Circulo();
		c2.setRaio(sc.nextDouble());
		Circulo c3 = new Circulo();
		c3.setRaio(sc.nextDouble());

		System.out.println("Area do primeiro raio");
		System.out.println(c1.calcularArea(c1.getRaio()));
		System.out.println("Perimetro do primeiro raio");
		System.out.println(c1.calcularPerimetro(c1.getRaio()));
		System.out.println();
		System.out.println("Area do segundo raio");
		System.out.println(c2.calcularArea(c2.getRaio()));
		System.out.println("Perimetro do segundo raio");
		System.out.println(c2.calcularPerimetro(c2.getRaio()));
		System.out.println();
		System.out.println("Area do terceiro raio");
		System.out.println(c3.calcularArea(c3.getRaio()));
		System.out.println("Perimetro do terceiro raio");
		System.out.println(c3.calcularPerimetro(c3.getRaio()));
		System.out.println();

		sc.close();

	}

}