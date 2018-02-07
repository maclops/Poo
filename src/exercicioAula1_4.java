
import java.util.Locale;
import java.util.Scanner;

public class exercicioAula1_4 {
	
	/*(estrutura condicional) Escreva um programa Java para ler os valores de
	quatro números N1, N2, N3 e N4. Calcule e imprima o valor da média
	aritmética dos mesmos. Imprimir também uma mensagem de "aprovado"
	ou "reprovado" no caso da média ser maior ou igual a seis, ou menor,
	respectivamente.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		System.out.println("Digite quatro valores, irei calcular a média aritimética deles.");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double media = (n1+n2+n3+n4)/4;
		System.out.printf("A média aritimética é = %.2f\n",media);
		if (media >= 6.0) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
		
		sc.close();

	}

}
